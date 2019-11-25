package typings.apolloDashServerDashCore.distGraphqlOptionsMod

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistedQueryOptions extends js.Object {
  var cache: KeyValueCache[String]
}

object PersistedQueryOptions {
  @scala.inline
  def apply(cache: KeyValueCache[String]): PersistedQueryOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersistedQueryOptions]
  }
}

