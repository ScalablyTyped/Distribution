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
    latestVcsWkid: Int | Double = null,
    latestWkid: Int | Double = null,
    vcsWkid: Int | Double = null,
    wkid: Int | Double = null
  ): SpatialReferenceWkid = {
    val __obj = js.Dynamic.literal()
    if (latestVcsWkid != null) __obj.updateDynamic("latestVcsWkid")(latestVcsWkid.asInstanceOf[js.Any])
    if (latestWkid != null) __obj.updateDynamic("latestWkid")(latestWkid.asInstanceOf[js.Any])
    if (vcsWkid != null) __obj.updateDynamic("vcsWkid")(vcsWkid.asInstanceOf[js.Any])
    if (wkid != null) __obj.updateDynamic("wkid")(wkid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReferenceWkid]
  }
}

