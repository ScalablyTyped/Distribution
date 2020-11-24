package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object algoliasearchLiteMod {
  
  type AlgoliaSearchOptions = typings.std.Partial[typings.algoliaClientCommon.mod.ClientTransporterOptions] with typings.algoliasearch.anon.WithoutCredentialsSearchC
  
  type WithoutCredentials[TClientOptions /* <: typings.algoliasearch.algoliasearchLiteMod.Credentials */] = typings.std.Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch-lite.Credentials */ typings.algoliasearch.algoliasearchStrings.appId | typings.algoliasearch.algoliasearchStrings.apiKey
  ]
}
