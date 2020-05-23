package typings.amapJsApi.AMap.MassMarks

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var lnglat: LocationValue
  var style: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply(lnglat: LocationValue, style: js.UndefOr[Double] = js.undefined): Data = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

