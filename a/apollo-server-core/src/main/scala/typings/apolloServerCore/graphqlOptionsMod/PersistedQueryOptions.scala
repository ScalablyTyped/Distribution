package typings.apolloServerCore.graphqlOptionsMod

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistedQueryOptions extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.undefined
  var ttl: js.UndefOr[Double | Null] = js.undefined
}

object PersistedQueryOptions {
  @scala.inline
  def apply(cache: KeyValueCache[String] = null, ttl: js.UndefOr[Null | Double] = js.undefined): PersistedQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistedQueryOptions]
  }
}

