package typings.angularServiceWorker

import typings.angularServiceWorker.angularServiceWorkerStrings.freshness
import typings.angularServiceWorker.angularServiceWorkerStrings.performance
import typings.angularServiceWorker.configMod.Duration
import typings.angularServiceWorker.configMod.Glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppData extends StObject {
    
    var appData: js.UndefOr[js.Object] = js.undefined
    
    var hash: String
  }
  object AppData {
    
    inline def apply(hash: String): AppData = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppData]
    }
    
    extension [Self <: AppData](x: Self) {
      
      inline def setAppData(value: js.Object): Self = StObject.set(x, "appData", value.asInstanceOf[js.Any])
      
      inline def setAppDataUndefined: Self = StObject.set(x, "appData", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheOpaqueResponses extends StObject {
    
    var cacheOpaqueResponses: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: Duration
    
    var maxSize: Double
    
    var strategy: js.UndefOr[freshness | performance] = js.undefined
    
    var timeout: js.UndefOr[Duration] = js.undefined
  }
  object CacheOpaqueResponses {
    
    inline def apply(maxAge: Duration, maxSize: Double): CacheOpaqueResponses = {
      val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheOpaqueResponses]
    }
    
    extension [Self <: CacheOpaqueResponses](x: Self) {
      
      inline def setCacheOpaqueResponses(value: Boolean): Self = StObject.set(x, "cacheOpaqueResponses", value.asInstanceOf[js.Any])
      
      inline def setCacheOpaqueResponsesUndefined: Self = StObject.set(x, "cacheOpaqueResponses", js.undefined)
      
      inline def setMaxAge(value: Duration): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: freshness | performance): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Files extends StObject {
    
    var files: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var urls: js.UndefOr[js.Array[Glob]] = js.undefined
  }
  object Files {
    
    inline def apply(): Files = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: js.Array[Glob]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: Glob*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setUrls(value: js.Array[Glob]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: Glob*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait Hash extends StObject {
    
    var appData: js.UndefOr[js.Object] = js.undefined
    
    var hash: String
  }
  object Hash {
    
    inline def apply(hash: String): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setAppData(value: js.Object): Self = StObject.set(x, "appData", value.asInstanceOf[js.Any])
      
      inline def setAppDataUndefined: Self = StObject.set(x, "appData", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.CacheQueryOptions, 'ignoreSearch'> */
  trait PickCacheQueryOptionsigno extends StObject {
    
    var ignoreSearch: js.UndefOr[Boolean] = js.undefined
  }
  object PickCacheQueryOptionsigno {
    
    inline def apply(): PickCacheQueryOptionsigno = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickCacheQueryOptionsigno]
    }
    
    extension [Self <: PickCacheQueryOptionsigno](x: Self) {
      
      inline def setIgnoreSearch(value: Boolean): Self = StObject.set(x, "ignoreSearch", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSearchUndefined: Self = StObject.set(x, "ignoreSearch", js.undefined)
    }
  }
  
  trait ServerPublicKey extends StObject {
    
    var serverPublicKey: String
  }
  object ServerPublicKey {
    
    inline def apply(serverPublicKey: String): ServerPublicKey = {
      val __obj = js.Dynamic.literal(serverPublicKey = serverPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerPublicKey]
    }
    
    extension [Self <: ServerPublicKey](x: Self) {
      
      inline def setServerPublicKey(value: String): Self = StObject.set(x, "serverPublicKey", value.asInstanceOf[js.Any])
    }
  }
}
