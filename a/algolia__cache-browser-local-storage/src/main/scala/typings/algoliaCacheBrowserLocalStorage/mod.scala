package typings.algoliaCacheBrowserLocalStorage

import typings.algoliaCacheCommon.mod.Cache
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/cache-browser-local-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBrowserLocalStorageCache(options: BrowserLocalStorageOptions): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserLocalStorageCache")(options.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  trait BrowserLocalStorageOptions extends StObject {
    
    /**
      * The cache key.
      */
    val key: String
    
    /**
      * The native local storage implementation.
      */
    val localStorage: js.UndefOr[Storage] = js.undefined
  }
  object BrowserLocalStorageOptions {
    
    inline def apply(key: String): BrowserLocalStorageOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserLocalStorageOptions]
    }
    
    extension [Self <: BrowserLocalStorageOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLocalStorage(value: Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
    }
  }
}
