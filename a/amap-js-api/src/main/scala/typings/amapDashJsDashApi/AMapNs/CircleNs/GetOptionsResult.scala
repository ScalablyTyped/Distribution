package typings.amapDashJsDashApi.AMapNs.CircleNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApi.AMapNs.Map
import typings.amapDashJsDashApi.AMapNs.StrokeLineJoin
import typings.amapDashJsDashApi.AMapNs.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polygon.GetOptionsResult<ExtraData>, {  path  :std.Array<amap-js-api.AMap.LngLat>,   center  :amap-js-api.AMap.LngLat,   radius  :number}> */
trait GetOptionsResult[ExtraData] extends js.Object {
  /**
    * 事件是否穿透到地图
    */
  var bubble: Boolean
  var center: LngLat
  /**
    * 是否支持点击
    */
  var clickable: Boolean
  /**
    * 自定义属性
    */
  var extData: ExtraData | js.Object
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
    * 所属地图
    */
  var map: Map
  /**
    * 多边形轮廓线的节点坐标数组
    */
  var path: js.Array[js.Array[LngLat] | LngLat]
  var radius: Double
  /**
    * 线条颜色
    */
  var strokeColor: String
  /**
    * 虚线的分段
    */
  var strokeDasharray: js.Array[Double]
  /**
    * 线条透明度
    */
  var strokeOpacity: Double
  /**
    * 线条样式，虚线或者实线
    */
  var strokeStyle: StrokeStyle
  /**
    * 线条宽度
    */
  var strokeWeight: Double
  var texture: String
  /**
    * 层级
    */
  var zIndex: Double
}

object GetOptionsResult {
  @scala.inline
  def apply[ExtraData](
    bubble: Boolean,
    center: LngLat,
    clickable: Boolean,
    extData: ExtraData | js.Object,
    fillColor: String,
    fillOpacity: Double,
    lineJoin: StrokeLineJoin,
    map: Map,
    path: js.Array[js.Array[LngLat] | LngLat],
    radius: Double,
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    texture: String,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(bubble = bubble, center = center, clickable = clickable, extData = extData.asInstanceOf[js.Any], fillColor = fillColor, fillOpacity = fillOpacity, lineJoin = lineJoin, map = map, path = path, radius = radius, strokeColor = strokeColor, strokeDasharray = strokeDasharray, strokeOpacity = strokeOpacity, strokeStyle = strokeStyle, strokeWeight = strokeWeight, texture = texture, zIndex = zIndex)
  
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
}

