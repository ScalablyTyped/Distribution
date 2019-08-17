package typings.amapDashJsDashApiDashMap3d.AMapNs.Object3DNs.MeshLineNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApi.AMapNs.Pixel
import typings.amapDashJsDashApiDashMap3d.amapDashJsDashApiDashMap3dStrings.meter
import typings.amapDashJsDashApiDashMap3d.amapDashJsDashApiDashMap3dStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[String | js.Array[Double]] = js.undefined
  var height: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var path: js.UndefOr[js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]] = js.undefined
  var unit: js.UndefOr[meter | px] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: String | js.Array[Double] = null,
    height: Double | js.Array[Double] = null,
    path: js.Array[LngLat | (js.Tuple2[Double, Double])] = null,
    unit: meter = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

