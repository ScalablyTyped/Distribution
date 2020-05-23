package typings.amapJsApi.AMap.InfoWindow

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApi.AMap.SizeValue
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ExtraData]
  extends typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
  /**
    * 信息窗体锚点
    */
  var anchor: js.UndefOr[Anchor] = js.undefined
  /**
    * 是否自动调整窗体到视野内
    */
  var autoMove: js.UndefOr[Boolean] = js.undefined
  /**
    * 控制是否在鼠标点击地图后关闭信息窗体
    */
  var closeWhenClickMap: js.UndefOr[Boolean] = js.undefined
  /**
    * 显示内容
    */
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  // internal
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 是否自定义窗体
    */
  var isCustom: js.UndefOr[Boolean] = js.undefined
  /**
    * 信息窗体显示位置偏移量
    */
  var offset: js.UndefOr[Pixel] = js.undefined
  /**
    * 信息窗体显示基点位置
    */
  var position: js.UndefOr[LocationValue] = js.undefined
  /**
    * 是否显示信息窗体阴影
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  /**
    * 信息窗体尺寸
    */
  var size: js.UndefOr[SizeValue] = js.undefined
}

object Options {
  @scala.inline
  def apply[ExtraData](
    anchor: Anchor = null,
    autoMove: js.UndefOr[Boolean] = js.undefined,
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    closeWhenClickMap: js.UndefOr[Boolean] = js.undefined,
    content: String | HTMLElement = null,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData = null,
    height: js.UndefOr[Double] = js.undefined,
    isCustom: js.UndefOr[Boolean] = js.undefined,
    map: Map = null,
    offset: Pixel = null,
    position: LocationValue = null,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    size: SizeValue = null
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoMove)) __obj.updateDynamic("autoMove")(autoMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeWhenClickMap)) __obj.updateDynamic("closeWhenClickMap")(closeWhenClickMap.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustom)) __obj.updateDynamic("isCustom")(isCustom.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

