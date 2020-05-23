package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.DrivingPolicy
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: js.UndefOr[String] = js.undefined
  var hideMarkers: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[typings.amapJsSdk.AMap.Map] = js.undefined
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  var showTraffic: js.UndefOr[Boolean] = js.undefined
}

object Extensions {
  @scala.inline
  def apply(
    extensions: String = null,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    map: typings.amapJsSdk.AMap.Map = null,
    panel: String | HTMLElement = null,
    policy: DrivingPolicy = null,
    showTraffic: js.UndefOr[Boolean] = js.undefined
  ): Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (!js.isUndefined(showTraffic)) __obj.updateDynamic("showTraffic")(showTraffic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
}

