package typings.apolloServerCaching.keyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueCacheSetOptions extends js.Object {
  var ttl: js.UndefOr[Double | Null] = js.undefined
}

object KeyValueCacheSetOptions {
  @scala.inline
  def apply(ttl: js.UndefOr[Null | Double] = js.undefined): KeyValueCacheSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueCacheSetOptions]
  }
}

