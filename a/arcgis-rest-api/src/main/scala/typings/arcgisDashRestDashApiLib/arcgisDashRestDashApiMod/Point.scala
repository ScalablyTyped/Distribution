package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends Geometry {
  var m: js.UndefOr[scala.Double] = js.undefined
  var x: scala.Double
  var y: scala.Double
  var z: js.UndefOr[scala.Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(
    x: scala.Double,
    y: scala.Double,
    m: scala.Int | scala.Double = null,
    spatialReference: SpatialReference = null,
    z: scala.Int | scala.Double = null
  ): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

