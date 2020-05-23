package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.AMap.Pixel
import typings.amapJsSdk.AMap.Size
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoMove extends js.Object {
  var autoMove: js.UndefOr[Boolean] = js.undefined
  var closeWhenClickMap: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  var isCustom: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
  var position: js.UndefOr[LngLat] = js.undefined
  var showShadow: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object AutoMove {
  @scala.inline
  def apply(
    autoMove: js.UndefOr[Boolean] = js.undefined,
    closeWhenClickMap: js.UndefOr[Boolean] = js.undefined,
    content: String | HTMLElement = null,
    isCustom: js.UndefOr[Boolean] = js.undefined,
    offset: Pixel = null,
    position: LngLat = null,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    size: Size = null
  ): AutoMove = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMove)) __obj.updateDynamic("autoMove")(autoMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeWhenClickMap)) __obj.updateDynamic("closeWhenClickMap")(closeWhenClickMap.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustom)) __obj.updateDynamic("isCustom")(isCustom.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMove]
  }
}

