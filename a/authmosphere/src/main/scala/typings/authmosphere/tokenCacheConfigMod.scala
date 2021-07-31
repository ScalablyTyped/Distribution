package typings.authmosphere

import typings.authmosphere.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenCacheConfigMod {
  
  trait CacheConfig extends StObject {
    
    var percentageLeft: Double
  }
  object CacheConfig {
    
    @scala.inline
    def apply(percentageLeft: Double): CacheConfig = {
      val __obj = js.Dynamic.literal(percentageLeft = percentageLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheConfig]
    }
    
    @scala.inline
    implicit class CacheConfigMutableBuilder[Self <: CacheConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercentageLeft(value: Double): Self = StObject.set(x, "percentageLeft", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenCacheOptions extends StObject {
    
    var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object TokenCacheOptions {
    
    @scala.inline
    def apply(): TokenCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenCacheOptions]
    }
    
    @scala.inline
    implicit class TokenCacheOptionsMutableBuilder[Self <: TokenCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
