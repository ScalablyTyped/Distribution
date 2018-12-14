package typings
package apicacheLib.apicacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** appendKey takes the req/res objects and returns a custom value to extend the cache key */
  var appendKey: js.UndefOr[js.Any] = js.undefined
  /** if true, enables console output */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** should be either a number (in ms) or a string, defaults to 1 hour */
  var defaultDuration: js.UndefOr[java.lang.String] = js.undefined
  /** if false, turns off caching globally (useful on dev) */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** list of headers that should never be cached */
  var headerBlacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
     * 'cache-control':  'no-cache' // example of header overwrite
     */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
     * if provided, uses the [node-redis](https://github.com/NodeRedis/node_redis) client instead of [memory-cache](https://github.com/ptarjan/node-cache)
     */
  var redisClient: js.UndefOr[redisLib.redisMod.RedisClient] = js.undefined
  var statusCodes: js.UndefOr[apicacheLib.Anon_Exclude] = js.undefined
}

