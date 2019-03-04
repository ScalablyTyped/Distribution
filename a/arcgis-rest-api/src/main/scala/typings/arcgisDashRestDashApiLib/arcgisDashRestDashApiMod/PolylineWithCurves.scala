package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineWithCurves
  extends HasZM
     with Geometry {
  var curvePaths: js.Array[js.Array[Position | JsonCurve]]
}

object PolylineWithCurves {
  @scala.inline
  def apply(
    curvePaths: js.Array[js.Array[Position | JsonCurve]],
    hasM: js.UndefOr[scala.Boolean] = js.undefined,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): PolylineWithCurves = {
    val __obj = js.Dynamic.literal(curvePaths = curvePaths)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[PolylineWithCurves]
  }
}

