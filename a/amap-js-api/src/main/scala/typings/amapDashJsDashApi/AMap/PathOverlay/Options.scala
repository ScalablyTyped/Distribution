package typings.amapDashJsDashApi.AMap.PathOverlay

import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.StrokeLineCap
import typings.amapDashJsDashApi.AMap.StrokeLineJoin
import typings.amapDashJsDashApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ExtraData]
  extends typings.amapDashJsDashApi.AMap.Overlay.Options[ExtraData] {
  /**
    * 折线两端线帽的绘制样式
    */
  var lineCap: js.UndefOr[StrokeLineCap] = js.undefined
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.undefined
  /**
    * 描边线条颜色
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /**
    * 虚线间隔
    */
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * 描边线条透明度
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * 描边样式
    */
  var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
  /**
    * 描边宽度
    */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  /**
    * 是否可见
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * 覆盖物层级
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[ExtraData](
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData = null,
    lineCap: StrokeLineCap = null,
    lineJoin: StrokeLineJoin = null,
    map: Map = null,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: StrokeStyle = null,
    strokeWeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (map != null) __obj.updateDynamic("map")(map)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

