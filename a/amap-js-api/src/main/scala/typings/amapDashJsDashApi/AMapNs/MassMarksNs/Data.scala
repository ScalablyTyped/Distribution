package typings.amapDashJsDashApi.AMapNs.MassMarksNs

import typings.amapDashJsDashApi.AMapNs.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var lnglat: LocationValue
  var style: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply(lnglat: LocationValue, style: Int | Double = null): Data = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

