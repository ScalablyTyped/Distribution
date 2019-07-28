package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon
  extends HasZM
     with Geometry {
  var rings: js.Array[js.Array[Position]]
}

object Polygon {
  @scala.inline
  def apply(
    rings: js.Array[js.Array[Position]],
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): Polygon = {
    val __obj = js.Dynamic.literal(rings = rings)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[Polygon]
  }
}

