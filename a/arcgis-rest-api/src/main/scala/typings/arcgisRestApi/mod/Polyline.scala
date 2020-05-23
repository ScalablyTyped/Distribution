package typings.arcgisRestApi.mod

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
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    spatialReference: SpatialReference = null
  ): Polyline = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.get.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyline]
  }
}

