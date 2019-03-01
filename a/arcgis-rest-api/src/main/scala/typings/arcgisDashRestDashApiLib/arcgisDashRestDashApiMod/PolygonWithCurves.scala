package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonWithCurves
  extends HasZM
     with Geometry {
  var curveRings: js.Array[js.Array[Position | JsonCurve]]
}

object PolygonWithCurves {
  @scala.inline
  def apply(
    curveRings: js.Array[js.Array[Position | JsonCurve]],
    hasM: js.UndefOr[scala.Boolean] = js.undefined,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): PolygonWithCurves = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("curveRings")(curveRings)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[PolygonWithCurves]
  }
}

