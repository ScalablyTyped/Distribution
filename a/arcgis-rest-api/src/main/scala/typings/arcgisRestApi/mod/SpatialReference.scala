package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisRestApi.mod.SpatialReferenceWkt
  - typings.arcgisRestApi.mod.SpatialReferenceWkid
*/
trait SpatialReference extends js.Object

object SpatialReference {
  @scala.inline
  def SpatialReferenceWkt(latestWkt: String = null, wkt: String = null): SpatialReference = {
    val __obj = js.Dynamic.literal()
    if (latestWkt != null) __obj.updateDynamic("latestWkt")(latestWkt.asInstanceOf[js.Any])
    if (wkt != null) __obj.updateDynamic("wkt")(wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReference]
  }
  @scala.inline
  def SpatialReferenceWkid(
    latestVcsWkid: Int | Double = null,
    latestWkid: Int | Double = null,
    vcsWkid: Int | Double = null,
    wkid: Int | Double = null
  ): SpatialReference = {
    val __obj = js.Dynamic.literal()
    if (latestVcsWkid != null) __obj.updateDynamic("latestVcsWkid")(latestVcsWkid.asInstanceOf[js.Any])
    if (latestWkid != null) __obj.updateDynamic("latestWkid")(latestWkid.asInstanceOf[js.Any])
    if (vcsWkid != null) __obj.updateDynamic("vcsWkid")(vcsWkid.asInstanceOf[js.Any])
    if (wkid != null) __obj.updateDynamic("wkid")(wkid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReference]
  }
}

