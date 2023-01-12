package typings.authmosphere

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesTokenCacheConfigMod {
  
  trait CacheConfig extends StObject {
    
    var percentageLeft: Double
  }
  object CacheConfig {
    
    inline def apply(percentageLeft: Double): CacheConfig = {
      val __obj = js.Dynamic.literal(percentageLeft = percentageLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheConfig] (val x: Self) extends AnyVal {
      
      inline def setPercentageLeft(value: Double): Self = StObject.set(x, "percentageLeft", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenCacheOptions extends StObject {
    
    var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object TokenCacheOptions {
    
    inline def apply(): TokenCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      inline def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
