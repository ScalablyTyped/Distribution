package typings.amapJsApiMap3d.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.meter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: js.Array[LngLat | (js.Tuple2[Double, Double])]
  var unit: js.UndefOr[meter] = js.undefined
}

object Path {
  @scala.inline
  def apply(path: js.Array[LngLat | (js.Tuple2[Double, Double])], unit: meter = null): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

