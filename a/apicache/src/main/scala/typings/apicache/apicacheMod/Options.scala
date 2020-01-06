package typings.apicache.apicacheMod

import org.scalablytyped.runtime.StringDictionary
import typings.apicache.Anon_Exclude
import typings.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  var statusCodes: js.UndefOr[Anon_Exclude] = js.undefined
  /**
    * enable/disable performance tracking... WARNING: super cool feature, but may cause memory overhead issues
    */
  var trackPerformance: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    appendKey: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultDuration: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    headerBlacklist: js.Array[String] = null,
    headers: StringDictionary[String] = null,
    redisClient: RedisClient = null,
    statusCodes: Anon_Exclude = null,
    trackPerformance: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (appendKey != null) __obj.updateDynamic("appendKey")(appendKey.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (defaultDuration != null) __obj.updateDynamic("defaultDuration")(defaultDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (headerBlacklist != null) __obj.updateDynamic("headerBlacklist")(headerBlacklist.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (redisClient != null) __obj.updateDynamic("redisClient")(redisClient.asInstanceOf[js.Any])
    if (statusCodes != null) __obj.updateDynamic("statusCodes")(statusCodes.asInstanceOf[js.Any])
    if (!js.isUndefined(trackPerformance)) __obj.updateDynamic("trackPerformance")(trackPerformance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

@JSImport("apicache", "options")
@js.native
object options extends js.Object {
  def apply(options: Options): js.Any = js.native
}

