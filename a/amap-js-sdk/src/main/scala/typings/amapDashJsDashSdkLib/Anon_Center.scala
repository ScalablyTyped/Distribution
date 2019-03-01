package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var center: js.UndefOr[amapDashJsDashSdkLib.AMapNs.LngLat] = js.undefined
  var crs: js.UndefOr[
    amapDashJsDashSdkLib.amapDashJsDashSdkLibStrings.EPSG3857 | amapDashJsDashSdkLib.amapDashJsDashSdkLibStrings.EPSG3395 | amapDashJsDashSdkLib.amapDashJsDashSdkLibStrings.EPSG4326
  ] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Center {
  @scala.inline
  def apply(
    center: amapDashJsDashSdkLib.AMapNs.LngLat = null,
    crs: amapDashJsDashSdkLib.amapDashJsDashSdkLibStrings.EPSG3857 | amapDashJsDashSdkLib.amapDashJsDashSdkLibStrings.EPSG3395 | amapDashJsDashSdkLib.amapDashJsDashSdkLibStrings.EPSG4326 = null,
    rotation: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): Anon_Center = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Center]
  }
}

