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
    latestVcsWkid: js.UndefOr[Double] = js.undefined,
    latestWkid: js.UndefOr[Double] = js.undefined,
    vcsWkid: js.UndefOr[Double] = js.undefined,
    wkid: js.UndefOr[Double] = js.undefined
  ): SpatialReference = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latestVcsWkid)) __obj.updateDynamic("latestVcsWkid")(latestVcsWkid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latestWkid)) __obj.updateDynamic("latestWkid")(latestWkid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vcsWkid)) __obj.updateDynamic("vcsWkid")(vcsWkid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wkid)) __obj.updateDynamic("wkid")(wkid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReference]
  }
}

