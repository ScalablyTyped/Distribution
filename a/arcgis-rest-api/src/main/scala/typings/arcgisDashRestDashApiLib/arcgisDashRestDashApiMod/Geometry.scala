package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

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
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[Geometry]
  }
}

