package typings.algoliasearchHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Client = typings.algoliasearch.algoliasearchMod.SearchClient
  
  type SearchOptions = typings.algoliaClientSearch.mod.SearchOptions
  
  type SearchParameters = typings.algoliasearchHelper.mod.SearchParameters_
  
  type SearchResponse[T] = typings.std.Response | typings.algoliaClientSearch.mod.SearchResponse[T]
  
  type SearchResults[T] = typings.algoliasearchHelper.mod.SearchResults_[T]
}
