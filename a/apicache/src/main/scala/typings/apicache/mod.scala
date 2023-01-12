package typings.apicache

import org.scalablytyped.runtime.StringDictionary
import typings.apicache.anon.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apicache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(target: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(target.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def clear(target: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(target.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def clone_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")().asInstanceOf[Any]
  
  inline def getDuration(duration: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")(duration.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getDuration(duration: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")(duration.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getIndex(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndex")().asInstanceOf[Any]
  
  inline def getPerformance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPerformance")().asInstanceOf[Any]
  
  @JSImport("apicache", "id")
  @js.native
  val id: Double = js.native
  
  inline def middleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")().asInstanceOf[Any]
  inline def middleware(duration: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def middleware(duration: String, toggleMiddleware: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: String, toggleMiddleware: Any, localOptions: Options_): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: String, toggleMiddleware: Unit, localOptions: Options_): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def middleware(duration: Double, toggleMiddleware: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: Double, toggleMiddleware: Any, localOptions: Options_): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: Double, toggleMiddleware: Unit, localOptions: Options_): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: Unit, toggleMiddleware: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: Unit, toggleMiddleware: Any, localOptions: Options_): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def middleware(duration: Unit, toggleMiddleware: Unit, localOptions: Options_): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def newInstance(config: Options_): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def options(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("options")().asInstanceOf[Any]
  inline def options(options: Options_): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resetIndex(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIndex")().asInstanceOf[Unit]
  
  trait Options_ extends StObject {
    
    /** appendKey takes the req/res objects and returns a custom value to extend the cache key */
    var appendKey: js.UndefOr[Any] = js.undefined
    
    /** if true, enables console output */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** should be either a number (in ms) or a string, defaults to 1 hour */
    var defaultDuration: js.UndefOr[String] = js.undefined
    
    /** if false, turns off caching globally (useful on dev) */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** list of headers that should never be cached */
    var headerBlacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * 'cache-control':  'no-cache' // example of header overwrite
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * if provided, uses the [node-redis](https://github.com/NodeRedis/node_redis) client instead of [memory-cache](https://github.com/ptarjan/node-cache)
      */
    var redisClient: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any
      ] = js.undefined
    
    var statusCodes: js.UndefOr[Exclude] = js.undefined
    
    /**
      * enable/disable performance tracking... WARNING: super cool feature, but may cause memory overhead issues
      */
    var trackPerformance: js.UndefOr[Boolean] = js.undefined
  }
  object Options_ {
    
    inline def apply(): Options_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
      
      inline def setAppendKey(value: Any): Self = StObject.set(x, "appendKey", value.asInstanceOf[js.Any])
      
      inline def setAppendKeyUndefined: Self = StObject.set(x, "appendKey", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefaultDuration(value: String): Self = StObject.set(x, "defaultDuration", value.asInstanceOf[js.Any])
      
      inline def setDefaultDurationUndefined: Self = StObject.set(x, "defaultDuration", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeaderBlacklist(value: js.Array[String]): Self = StObject.set(x, "headerBlacklist", value.asInstanceOf[js.Any])
      
      inline def setHeaderBlacklistUndefined: Self = StObject.set(x, "headerBlacklist", js.undefined)
      
      inline def setHeaderBlacklistVarargs(value: String*): Self = StObject.set(x, "headerBlacklist", js.Array(value*))
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setRedisClient(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any
      ): Self = StObject.set(x, "redisClient", value.asInstanceOf[js.Any])
      
      inline def setRedisClientUndefined: Self = StObject.set(x, "redisClient", js.undefined)
      
      inline def setStatusCodes(value: Exclude): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
      
      inline def setTrackPerformance(value: Boolean): Self = StObject.set(x, "trackPerformance", value.asInstanceOf[js.Any])
      
      inline def setTrackPerformanceUndefined: Self = StObject.set(x, "trackPerformance", js.undefined)
    }
  }
}
