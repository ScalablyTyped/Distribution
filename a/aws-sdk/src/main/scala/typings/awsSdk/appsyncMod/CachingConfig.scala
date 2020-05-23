package typings.awsSdk.appsyncMod

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
  def apply(cachingKeys: CachingKeys = null, ttl: js.UndefOr[Long] = js.undefined): CachingConfig = {
    val __obj = js.Dynamic.literal()
    if (cachingKeys != null) __obj.updateDynamic("cachingKeys")(cachingKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachingConfig]
  }
}

