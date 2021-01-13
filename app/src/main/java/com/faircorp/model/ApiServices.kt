package com.faircorp.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService : WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://faircorp-youssef-lamzaouak.cleverapps.io:443/api/")
            .build()
            .create(WindowApiService::class.java)
    }
}

//    https://dev-mind.fr/training/android/
//     https://faircorp-youssef-lamzaouak.cleverapps.io:443/api/   my api
