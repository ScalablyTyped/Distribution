package typings.amapDashJsDashApi.AMapNs.OverlayNs

import typings.amapDashJsDashApi.AMapNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ExtraData] extends js.Object {
  /**
    * 事件是否穿透到地图
    */
  var bubble: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否支持点击
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * 鼠标悬停时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * 是否支持拖拽
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * 自定义数据
    */
  var extData: js.UndefOr[ExtraData] = js.undefined
  /**
    * 所属地图
    */
  var map: js.UndefOr[Map] = js.undefined
}

object Options {
  @scala.inline
  def apply[ExtraData](
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData = null,
    map: Map = null
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

