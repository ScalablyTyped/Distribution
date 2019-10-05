package typings.amapDashJsDashApiDashMap3d.AMap.Object3D.Prism

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: String | (js.Array[js.Array[Double] | Double | String])
  var color2: js.UndefOr[String | (js.Array[js.Array[Double] | Double | String])] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]
}

object Options {
  @scala.inline
  def apply(
    color: String | (js.Array[js.Array[Double] | Double | String]),
    path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel],
    color2: String | (js.Array[js.Array[Double] | Double | String]) = null,
    height: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path)
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

