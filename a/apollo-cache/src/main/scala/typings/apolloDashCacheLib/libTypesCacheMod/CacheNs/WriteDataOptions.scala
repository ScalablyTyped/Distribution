package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteDataOptions[TData] extends js.Object {
  var data: TData
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object WriteDataOptions {
  @scala.inline
  def apply[TData](data: TData, id: java.lang.String = null): WriteDataOptions[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WriteDataOptions[TData]]
  }
}

