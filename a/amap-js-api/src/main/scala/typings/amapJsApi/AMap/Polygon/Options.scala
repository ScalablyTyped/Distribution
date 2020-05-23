package typings.amapJsApi.AMap.Polygon

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ExtraData]
  extends typings.amapJsApi.AMap.PathOverlay.Options[ExtraData] {
  /**
    * 多边形填充颜色
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    * 边形填充透明度
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * 多边形轮廓线的节点坐标数组
    */
  var path: js.UndefOr[js.Array[js.Array[LocationValue] | LocationValue]] = js.undefined
}

object Options {
  @scala.inline
  def apply[ExtraData](
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData = null,
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    lineCap: StrokeLineCap = null,
    lineJoin: StrokeLineJoin = null,
    map: Map = null,
    path: js.Array[js.Array[LocationValue] | LocationValue] = null,
    strokeColor: String = null,
    strokeDasharray: js.Array[Double] = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeStyle: StrokeStyle = null,
    strokeWeight: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWeight)) __obj.updateDynamic("strokeWeight")(strokeWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

