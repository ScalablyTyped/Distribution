package typings.algoliasearch

import typings.algoliasearch.algoliasearchMod.AlgoliaSearchOptions
import typings.algoliasearch.algoliasearchMod.SearchClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("algoliasearch", JSImport.Default)
    @js.native
    def apply(appId: String, apiKey: String): SearchClient = js.native
    @JSImport("algoliasearch", JSImport.Default)
    @js.native
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
    @JSImport("algoliasearch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
