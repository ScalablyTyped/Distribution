package typings.algoliaCacheBrowserLocalStorage

import typings.algoliaCacheCommon.mod.Cache
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/cache-browser-local-storage", "createBrowserLocalStorageCache")
  @js.native
  def createBrowserLocalStorageCache(options: BrowserLocalStorageOptions): Cache = js.native
  
  @js.native
  trait BrowserLocalStorageOptions extends StObject {
    
    /**
      * The cache key.
      */
    val key: String = js.native
    
    /**
      * The native local storage implementation.
      */
    val localStorage: js.UndefOr[Storage] = js.native
  }
  object BrowserLocalStorageOptions {
    
    @scala.inline
    def apply(key: String): BrowserLocalStorageOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserLocalStorageOptions]
    }
    
    @scala.inline
    implicit class BrowserLocalStorageOptionsMutableBuilder[Self <: BrowserLocalStorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalStorage(value: Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
    }
  }
}
