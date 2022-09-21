package typings.algoliasearchHelper.anon

import typings.algoliasearch.algoliasearchLiteMod.AlgoliaSearchOptions
import typings.algoliasearch.algoliasearchLiteMod.SearchClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofalgoliasearch extends StObject {
  
  def apply(appId: String, apiKey: String): SearchClient = js.native
  def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
  
  var version: String = js.native
}
