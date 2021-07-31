package typings.apicache

import org.scalablytyped.runtime.StringDictionary
import typings.apicache.anon.Exclude
import typings.redis.mod.RedisClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apicache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clear(target: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(target.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def clear(target: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(target.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def clone_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")().asInstanceOf[js.Any]
  
  @scala.inline
  def getDuration(duration: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")(duration.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getDuration(duration: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")(duration.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getIndex(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndex")().asInstanceOf[js.Any]
  
  @scala.inline
  def getPerformance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPerformance")().asInstanceOf[js.Any]
  
  @JSImport("apicache", "id")
  @js.native
  val id: Double = js.native
  
  @scala.inline
  def middleware(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")().asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: String, toggleMiddleware: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: String, toggleMiddleware: js.Any, localOptions: Options_): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: String, toggleMiddleware: Unit, localOptions: Options_): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: Double, toggleMiddleware: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: Double, toggleMiddleware: js.Any, localOptions: Options_): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: Double, toggleMiddleware: Unit, localOptions: Options_): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: Unit, toggleMiddleware: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: Unit, toggleMiddleware: js.Any, localOptions: Options_): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def middleware(duration: Unit, toggleMiddleware: Unit, localOptions: Options_): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(duration.asInstanceOf[js.Any], toggleMiddleware.asInstanceOf[js.Any], localOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def newInstance(config: Options_): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def options(options: Options_): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def resetIndex(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIndex")().asInstanceOf[Unit]
  
  trait Options_ extends StObject {
    
    /** appendKey takes the req/res objects and returns a custom value to extend the cache key */
    var appendKey: js.UndefOr[js.Any] = js.undefined
    
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
    var redisClient: js.UndefOr[RedisClient] = js.undefined
    
    var statusCodes: js.UndefOr[Exclude] = js.undefined
    
    /**
      * enable/disable performance tracking... WARNING: super cool feature, but may cause memory overhead issues
      */
    var trackPerformance: js.UndefOr[Boolean] = js.undefined
  }
  object Options_ {
    
    @scala.inline
    def apply(): Options_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options_]
    }
    
    @scala.inline
    implicit class Options_MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendKey(value: js.Any): Self = StObject.set(x, "appendKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendKeyUndefined: Self = StObject.set(x, "appendKey", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefaultDuration(value: String): Self = StObject.set(x, "defaultDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDurationUndefined: Self = StObject.set(x, "defaultDuration", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHeaderBlacklist(value: js.Array[String]): Self = StObject.set(x, "headerBlacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBlacklistUndefined: Self = StObject.set(x, "headerBlacklist", js.undefined)
      
      @scala.inline
      def setHeaderBlacklistVarargs(value: String*): Self = StObject.set(x, "headerBlacklist", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setRedisClient(value: RedisClient): Self = StObject.set(x, "redisClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedisClientUndefined: Self = StObject.set(x, "redisClient", js.undefined)
      
      @scala.inline
      def setStatusCodes(value: Exclude): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
      
      @scala.inline
      def setTrackPerformance(value: Boolean): Self = StObject.set(x, "trackPerformance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackPerformanceUndefined: Self = StObject.set(x, "trackPerformance", js.undefined)
    }
  }
}
