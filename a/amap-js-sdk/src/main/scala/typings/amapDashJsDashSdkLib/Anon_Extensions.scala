package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extensions extends js.Object {
  var extensions: js.UndefOr[java.lang.String] = js.undefined
  var hideMarkers: js.UndefOr[scala.Boolean] = js.undefined
  var map: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Map] = js.undefined
  var panel: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var policy: js.UndefOr[amapDashJsDashSdkLib.AMapNs.DrivingPolicy] = js.undefined
  var showTraffic: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Extensions {
  @scala.inline
  def apply(
    extensions: java.lang.String = null,
    hideMarkers: js.UndefOr[scala.Boolean] = js.undefined,
    map: amapDashJsDashSdkLib.AMapNs.Map = null,
    panel: java.lang.String | stdLib.HTMLElement = null,
    policy: amapDashJsDashSdkLib.AMapNs.DrivingPolicy = null,
    showTraffic: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers)
    if (map != null) __obj.updateDynamic("map")(map)
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (!js.isUndefined(showTraffic)) __obj.updateDynamic("showTraffic")(showTraffic)
    __obj.asInstanceOf[Anon_Extensions]
  }
}

