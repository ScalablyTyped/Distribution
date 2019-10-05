package typings.amapDashJsDashApi.AMap.Polygon

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.StrokeLineJoin
import typings.amapDashJsDashApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptionsResult[ExtraData]
  extends typings.amapDashJsDashApi.AMap.ShapeOverlay.GetOptionsResult[ExtraData] {
  /**
    * 多边形填充颜色
    */
  var fillColor: String
  /**
    * 边形填充透明度
    */
  var fillOpacity: Double
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: StrokeLineJoin
  /**
    * 多边形轮廓线的节点坐标数组
    */
  var path: js.Array[js.Array[LngLat] | LngLat]
  var texture: String
}

object GetOptionsResult {
  @scala.inline
  def apply[ExtraData](
    bubble: Boolean,
    clickable: Boolean,
    extData: ExtraData | js.Object,
    fillColor: String,
    fillOpacity: Double,
    lineJoin: StrokeLineJoin,
    map: Map,
    path: js.Array[js.Array[LngLat] | LngLat],
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    texture: String,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(bubble = bubble, clickable = clickable, extData = extData.asInstanceOf[js.Any], fillColor = fillColor, fillOpacity = fillOpacity, lineJoin = lineJoin, map = map, path = path, strokeColor = strokeColor, strokeDasharray = strokeDasharray, strokeOpacity = strokeOpacity, strokeStyle = strokeStyle, strokeWeight = strokeWeight, texture = texture, zIndex = zIndex)
  
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
}

