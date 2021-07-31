package typings.algoliasearch

import typings.algoliasearch.algoliasearchLiteMod.AlgoliaSearchOptions
import typings.algoliasearch.algoliasearchLiteMod.SearchClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liteMod {
  
  object default {
    
    @scala.inline
    def apply(appId: String, apiKey: String): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    @scala.inline
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    
    @JSImport("algoliasearch/lite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch/lite", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
