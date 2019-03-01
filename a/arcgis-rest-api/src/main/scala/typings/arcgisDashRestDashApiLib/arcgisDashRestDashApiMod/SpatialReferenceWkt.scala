package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReferenceWkt extends SpatialReference {
  var latestWkt: js.UndefOr[java.lang.String] = js.undefined
  var wkt: js.UndefOr[java.lang.String] = js.undefined
}

object SpatialReferenceWkt {
  @scala.inline
  def apply(latestWkt: java.lang.String = null, wkt: java.lang.String = null): SpatialReferenceWkt = {
    val __obj = js.Dynamic.literal()
    if (latestWkt != null) __obj.updateDynamic("latestWkt")(latestWkt)
    if (wkt != null) __obj.updateDynamic("wkt")(wkt)
    __obj.asInstanceOf[SpatialReferenceWkt]
  }
}

