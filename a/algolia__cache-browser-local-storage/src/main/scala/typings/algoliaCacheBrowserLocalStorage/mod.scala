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
  
  trait BrowserLocalStorageCacheItem extends StObject {
    
    /**
      * The cache item creation timestamp.
      */
    val timestamp: Double
    
    /**
      * The cache item value
      */
    val value: Any
  }
  object BrowserLocalStorageCacheItem {
    
    inline def apply(timestamp: Double, value: Any): BrowserLocalStorageCacheItem = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserLocalStorageCacheItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserLocalStorageCacheItem] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrowserLocalStorageOptions extends StObject {
    
    /**
      * The cache key.
      */
    val key: String
    
    /**
      * The native local storage implementation.
      */
    val localStorage: js.UndefOr[Storage] = js.undefined
    
    /**
      * The time to live for each cached item in seconds.
      */
    val timeToLive: js.UndefOr[Double] = js.undefined
  }
  object BrowserLocalStorageOptions {
    
    inline def apply(key: String): BrowserLocalStorageOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserLocalStorageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserLocalStorageOptions] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLocalStorage(value: Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
    }
  }
}
