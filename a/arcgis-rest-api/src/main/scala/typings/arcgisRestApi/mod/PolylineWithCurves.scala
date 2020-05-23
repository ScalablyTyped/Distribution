package typings.arcgisRestApi.mod

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
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): PolylineWithCurves = {
    val __obj = js.Dynamic.literal(curvePaths = curvePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.get.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineWithCurves]
  }
}

