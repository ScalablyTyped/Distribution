package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReferenceWkt extends SpatialReference {
  var latestWkt: js.UndefOr[String] = js.undefined
  var wkt: js.UndefOr[String] = js.undefined
}

object SpatialReferenceWkt {
  @scala.inline
  def apply(latestWkt: String = null, wkt: String = null): SpatialReferenceWkt = {
    val __obj = js.Dynamic.literal()
    if (latestWkt != null) __obj.updateDynamic("latestWkt")(latestWkt.asInstanceOf[js.Any])
    if (wkt != null) __obj.updateDynamic("wkt")(wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReferenceWkt]
  }
}

