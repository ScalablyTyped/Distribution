package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object algoliasearchMod {
  
  type AlgoliaSearchOptions = typings.std.Partial[typings.algoliaClientCommon.mod.ClientTransporterOptions] with typings.algoliasearch.anon.WithoutCredentialsSearchC
  
  type InitAnalyticsOptions = typings.std.Partial[typings.algoliaClientCommon.mod.ClientTransporterOptions] with typings.algoliasearch.anon.OptionalCredentialsAnalyt
  
  type InitRecommendationOptions = typings.std.Partial[typings.algoliaClientCommon.mod.ClientTransporterOptions] with typings.algoliasearch.anon.OptionalCredentialsRecomm
  
  type OptionalCredentials[TClientOptions /* <: typings.algoliasearch.algoliasearchMod.Credentials */] = (typings.std.Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ typings.algoliasearch.algoliasearchStrings.appId | typings.algoliasearch.algoliasearchStrings.apiKey
  ]) with (typings.std.Pick[
    typings.std.Partial[TClientOptions], 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ typings.algoliasearch.algoliasearchStrings.appId | typings.algoliasearch.algoliasearchStrings.apiKey
  ])
  
  type WithoutCredentials[TClientOptions /* <: typings.algoliasearch.algoliasearchMod.Credentials */] = typings.std.Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ typings.algoliasearch.algoliasearchStrings.appId | typings.algoliasearch.algoliasearchStrings.apiKey
  ]
}
