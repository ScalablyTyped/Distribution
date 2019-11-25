package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

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
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): PolygonWithCurves = {
    val __obj = js.Dynamic.literal(curveRings = curveRings.asInstanceOf[js.Any])
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonWithCurves]
  }
}

