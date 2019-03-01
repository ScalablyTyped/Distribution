package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsDestination extends js.Object {
  var asDestination: js.UndefOr[scala.Boolean] = js.undefined
  var asOrigin: js.UndefOr[scala.Boolean] = js.undefined
  var autoMove: js.UndefOr[scala.Boolean] = js.undefined
  var closeWhenClickMap: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var driving: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Pixel] = js.undefined
  var panel: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var placeSearch: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[amapDashJsDashSdkLib.AMapNs.LngLat] = js.undefined
  var searchRadius: js.UndefOr[scala.Double] = js.undefined
  var transit: js.UndefOr[scala.Boolean] = js.undefined
  var walking: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AsDestination {
  @scala.inline
  def apply(
    asDestination: js.UndefOr[scala.Boolean] = js.undefined,
    asOrigin: js.UndefOr[scala.Boolean] = js.undefined,
    autoMove: js.UndefOr[scala.Boolean] = js.undefined,
    closeWhenClickMap: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | stdLib.HTMLElement = null,
    driving: js.UndefOr[scala.Boolean] = js.undefined,
    offset: amapDashJsDashSdkLib.AMapNs.Pixel = null,
    panel: java.lang.String | stdLib.HTMLElement = null,
    placeSearch: js.UndefOr[scala.Boolean] = js.undefined,
    position: amapDashJsDashSdkLib.AMapNs.LngLat = null,
    searchRadius: scala.Int | scala.Double = null,
    transit: js.UndefOr[scala.Boolean] = js.undefined,
    walking: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AsDestination = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asDestination)) __obj.updateDynamic("asDestination")(asDestination)
    if (!js.isUndefined(asOrigin)) __obj.updateDynamic("asOrigin")(asOrigin)
    if (!js.isUndefined(autoMove)) __obj.updateDynamic("autoMove")(autoMove)
    if (!js.isUndefined(closeWhenClickMap)) __obj.updateDynamic("closeWhenClickMap")(closeWhenClickMap)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(driving)) __obj.updateDynamic("driving")(driving)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (!js.isUndefined(placeSearch)) __obj.updateDynamic("placeSearch")(placeSearch)
    if (position != null) __obj.updateDynamic("position")(position)
    if (searchRadius != null) __obj.updateDynamic("searchRadius")(searchRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(transit)) __obj.updateDynamic("transit")(transit)
    if (!js.isUndefined(walking)) __obj.updateDynamic("walking")(walking)
    __obj.asInstanceOf[Anon_AsDestination]
  }
}

