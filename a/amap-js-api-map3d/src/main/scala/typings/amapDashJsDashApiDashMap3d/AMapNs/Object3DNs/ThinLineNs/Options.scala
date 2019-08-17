package typings.amapDashJsDashApiDashMap3d.AMapNs.Object3DNs.ThinLineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var color: String
  var dashArray: js.UndefOr[js.Array[Double]] = js.undefined
  var path: js.Array[js.Tuple2[Double, Double]]
}

object Options {
  @scala.inline
  def apply(
    color: String,
    path: js.Array[js.Tuple2[Double, Double]],
    altitude: Int | Double = null,
    dashArray: js.Array[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal(color = color, path = path)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    __obj.asInstanceOf[Options]
  }
}

