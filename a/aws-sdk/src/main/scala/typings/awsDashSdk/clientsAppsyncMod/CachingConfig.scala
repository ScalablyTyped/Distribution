package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachingConfig extends js.Object {
  /**
    * The caching keys for a resolver that has caching enabled. Valid values are entries from the $context.identity and $context.arguments maps.
    */
  var cachingKeys: js.UndefOr[CachingKeys] = js.native
  /**
    * The TTL in seconds for a resolver that has caching enabled. Valid values are between 1 and 3600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.native
}

object CachingConfig {
  @scala.inline
  def apply(cachingKeys: CachingKeys = null, ttl: Int | Double = null): CachingConfig = {
    val __obj = js.Dynamic.literal()
    if (cachingKeys != null) __obj.updateDynamic("cachingKeys")(cachingKeys.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachingConfig]
  }
}

