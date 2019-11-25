package typings.amapDashJsDashApiDashMap3d

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApiDashMap3d.amapDashJsDashApiDashMap3dStrings.meter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Meter extends js.Object {
  var path: js.Array[LngLat | (js.Tuple2[Double, Double])]
  var unit: js.UndefOr[meter] = js.undefined
}

object Anon_Meter {
  @scala.inline
  def apply(path: js.Array[LngLat | (js.Tuple2[Double, Double])], unit: meter = null): Anon_Meter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Meter]
  }
}

