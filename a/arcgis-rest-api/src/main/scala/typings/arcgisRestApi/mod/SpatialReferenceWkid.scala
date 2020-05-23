package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReferenceWkid extends SpatialReference {
  var latestVcsWkid: js.UndefOr[Double] = js.undefined
  var latestWkid: js.UndefOr[Double] = js.undefined
  var vcsWkid: js.UndefOr[Double] = js.undefined
  var wkid: js.UndefOr[Double] = js.undefined
}

object SpatialReferenceWkid {
  @scala.inline
  def apply(
    latestVcsWkid: js.UndefOr[Double] = js.undefined,
    latestWkid: js.UndefOr[Double] = js.undefined,
    vcsWkid: js.UndefOr[Double] = js.undefined,
    wkid: js.UndefOr[Double] = js.undefined
  ): SpatialReferenceWkid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latestVcsWkid)) __obj.updateDynamic("latestVcsWkid")(latestVcsWkid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latestWkid)) __obj.updateDynamic("latestWkid")(latestWkid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vcsWkid)) __obj.updateDynamic("vcsWkid")(vcsWkid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wkid)) __obj.updateDynamic("wkid")(wkid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReferenceWkid]
  }
}

