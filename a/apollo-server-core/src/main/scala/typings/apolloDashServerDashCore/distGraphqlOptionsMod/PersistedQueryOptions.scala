package typings.apolloDashServerDashCore.distGraphqlOptionsMod

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistedQueryOptions extends js.Object {
  var cache: KeyValueCache[String]
  var ttl: js.UndefOr[Double | Null] = js.undefined
}

object PersistedQueryOptions {
  @scala.inline
  def apply(cache: KeyValueCache[String], ttl: Int | Double = null): PersistedQueryOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistedQueryOptions]
  }
}

