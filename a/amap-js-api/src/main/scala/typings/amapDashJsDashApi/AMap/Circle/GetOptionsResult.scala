package typings.amapDashJsDashApi.AMap.Circle

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.StrokeLineJoin
import typings.amapDashJsDashApi.AMap.StrokeStyle
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
  var path: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat]
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
    path: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat],
    radius: Double,
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    texture: String,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(bubble = bubble.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
}

