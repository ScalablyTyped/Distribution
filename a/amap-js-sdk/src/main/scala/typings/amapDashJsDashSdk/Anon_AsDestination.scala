package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.LngLat
import typings.amapDashJsDashSdk.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsDestination extends js.Object {
  var asDestination: js.UndefOr[Boolean] = js.undefined
  var asOrigin: js.UndefOr[Boolean] = js.undefined
  var autoMove: js.UndefOr[Boolean] = js.undefined
  var closeWhenClickMap: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  var driving: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  var placeSearch: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[LngLat] = js.undefined
  var searchRadius: js.UndefOr[Double] = js.undefined
  var transit: js.UndefOr[Boolean] = js.undefined
  var walking: js.UndefOr[Boolean] = js.undefined
}

object Anon_AsDestination {
  @scala.inline
  def apply(
    asDestination: js.UndefOr[Boolean] = js.undefined,
    asOrigin: js.UndefOr[Boolean] = js.undefined,
    autoMove: js.UndefOr[Boolean] = js.undefined,
    closeWhenClickMap: js.UndefOr[Boolean] = js.undefined,
    content: String | HTMLElement = null,
    driving: js.UndefOr[Boolean] = js.undefined,
    offset: Pixel = null,
    panel: String | HTMLElement = null,
    placeSearch: js.UndefOr[Boolean] = js.undefined,
    position: LngLat = null,
    searchRadius: Int | Double = null,
    transit: js.UndefOr[Boolean] = js.undefined,
    walking: js.UndefOr[Boolean] = js.undefined
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

