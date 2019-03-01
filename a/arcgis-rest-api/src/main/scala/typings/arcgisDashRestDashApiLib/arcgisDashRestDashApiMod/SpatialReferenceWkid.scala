package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReferenceWkid extends SpatialReference {
  var latestVcsWkid: js.UndefOr[scala.Double] = js.undefined
  var latestWkid: js.UndefOr[scala.Double] = js.undefined
  var vcsWkid: js.UndefOr[scala.Double] = js.undefined
  var wkid: js.UndefOr[scala.Double] = js.undefined
}

object SpatialReferenceWkid {
  @scala.inline
  def apply(
    latestVcsWkid: scala.Int | scala.Double = null,
    latestWkid: scala.Int | scala.Double = null,
    vcsWkid: scala.Int | scala.Double = null,
    wkid: scala.Int | scala.Double = null
  ): SpatialReferenceWkid = {
    val __obj = js.Dynamic.literal()
    if (latestVcsWkid != null) __obj.updateDynamic("latestVcsWkid")(latestVcsWkid.asInstanceOf[js.Any])
    if (latestWkid != null) __obj.updateDynamic("latestWkid")(latestWkid.asInstanceOf[js.Any])
    if (vcsWkid != null) __obj.updateDynamic("vcsWkid")(vcsWkid.asInstanceOf[js.Any])
    if (wkid != null) __obj.updateDynamic("wkid")(wkid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReferenceWkid]
  }
}

