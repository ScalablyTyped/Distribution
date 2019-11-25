package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}

object Geometry {
  @scala.inline
  def apply(spatialReference: SpatialReference = null): Geometry = {
    val __obj = js.Dynamic.literal()
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

