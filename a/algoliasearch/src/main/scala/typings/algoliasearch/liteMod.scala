package typings.algoliasearch

import typings.algoliasearch.algoliasearchLiteMod.AlgoliaSearchOptions
import typings.algoliasearch.algoliasearchLiteMod.SearchClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch/lite", JSImport.Namespace)
@js.native
object liteMod extends js.Object {
  @js.native
  object default extends js.Object {
    var version: String = js.native
    def apply(appId: String, apiKey: String): SearchClient = js.native
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
  }
  
}

