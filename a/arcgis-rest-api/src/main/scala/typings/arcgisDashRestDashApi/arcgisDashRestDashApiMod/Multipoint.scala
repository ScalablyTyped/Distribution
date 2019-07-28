package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multipoint
  extends HasZM
     with Geometry {
  var points: js.Array[Position]
}

object Multipoint {
  @scala.inline
  def apply(
    points: js.Array[Position],
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): Multipoint = {
    val __obj = js.Dynamic.literal(points = points)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[Multipoint]
  }
}

