package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsDestination extends js.Object {
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

object AsDestination {
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
    searchRadius: js.UndefOr[Double] = js.undefined,
    transit: js.UndefOr[Boolean] = js.undefined,
    walking: js.UndefOr[Boolean] = js.undefined
  ): AsDestination = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asDestination)) __obj.updateDynamic("asDestination")(asDestination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asOrigin)) __obj.updateDynamic("asOrigin")(asOrigin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoMove)) __obj.updateDynamic("autoMove")(autoMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeWhenClickMap)) __obj.updateDynamic("closeWhenClickMap")(closeWhenClickMap.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(driving)) __obj.updateDynamic("driving")(driving.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (!js.isUndefined(placeSearch)) __obj.updateDynamic("placeSearch")(placeSearch.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(searchRadius)) __obj.updateDynamic("searchRadius")(searchRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transit)) __obj.updateDynamic("transit")(transit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(walking)) __obj.updateDynamic("walking")(walking.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsDestination]
  }
}

