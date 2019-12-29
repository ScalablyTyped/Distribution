package typings.apolloDashServerDashCaching.distKeyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueCacheSetOptions extends js.Object {
  var ttl: js.UndefOr[Double | Null] = js.undefined
}

object KeyValueCacheSetOptions {
  @scala.inline
  def apply(ttl: Int | Double = null): KeyValueCacheSetOptions = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueCacheSetOptions]
  }
}

