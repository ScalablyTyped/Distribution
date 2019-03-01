package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyline
  extends HasZM
     with Geometry {
  var paths: js.Array[js.Array[Position]]
}

object Polyline {
  @scala.inline
  def apply(
    paths: js.Array[js.Array[Position]],
    hasM: js.UndefOr[scala.Boolean] = js.undefined,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): Polyline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[Polyline]
  }
}

