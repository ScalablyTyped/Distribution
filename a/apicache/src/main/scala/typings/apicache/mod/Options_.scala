package typings.apicache.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apicache.anon.Exclude
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends js.Object {
  /** appendKey takes the req/res objects and returns a custom value to extend the cache key */
  var appendKey: js.UndefOr[js.Any] = js.native
  /** if true, enables console output */
  var debug: js.UndefOr[Boolean] = js.native
  /** should be either a number (in ms) or a string, defaults to 1 hour */
  var defaultDuration: js.UndefOr[String] = js.native
  /** if false, turns off caching globally (useful on dev) */
  var enabled: js.UndefOr[Boolean] = js.native
  /** list of headers that should never be cached */
  var headerBlacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * 'cache-control':  'no-cache' // example of header overwrite
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * if provided, uses the [node-redis](https://github.com/NodeRedis/node_redis) client instead of [memory-cache](https://github.com/ptarjan/node-cache)
    */
  var redisClient: js.UndefOr[RedisClient] = js.native
  var statusCodes: js.UndefOr[Exclude] = js.native
  /**
    * enable/disable performance tracking... WARNING: super cool feature, but may cause memory overhead issues
    */
  var trackPerformance: js.UndefOr[Boolean] = js.native
}

object Options_ {
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendKey(value: js.Any): Self = this.set("appendKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendKey: Self = this.set("appendKey", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefaultDuration(value: String): Self = this.set("defaultDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDuration: Self = this.set("defaultDuration", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeaderBlacklistVarargs(value: String*): Self = this.set("headerBlacklist", js.Array(value :_*))
    @scala.inline
    def setHeaderBlacklist(value: js.Array[String]): Self = this.set("headerBlacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBlacklist: Self = this.set("headerBlacklist", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setRedisClient(value: RedisClient): Self = this.set("redisClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedisClient: Self = this.set("redisClient", js.undefined)
    @scala.inline
    def setStatusCodes(value: Exclude): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCodes: Self = this.set("statusCodes", js.undefined)
    @scala.inline
    def setTrackPerformance(value: Boolean): Self = this.set("trackPerformance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackPerformance: Self = this.set("trackPerformance", js.undefined)
  }
  
}

