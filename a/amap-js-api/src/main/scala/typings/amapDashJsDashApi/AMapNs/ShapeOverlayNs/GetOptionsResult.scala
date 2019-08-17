package typings.amapDashJsDashApi.AMapNs.ShapeOverlayNs

import typings.amapDashJsDashApi.AMapNs.Map
import typings.amapDashJsDashApi.AMapNs.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptionsResult[ExtraData] extends js.Object {
  /**
    * 事件是否穿透到地图
    */
  var bubble: Boolean
  /**
    * 是否支持点击
    */
  var clickable: Boolean
  /**
    * 自定义属性
    */
  var extData: ExtraData | js.Object
  /**
    * 所属地图
    */
  var map: Map
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
  /**
    * 层级
    */
  var zIndex: Double
}

object GetOptionsResult {
  @scala.inline
  def apply[ExtraData](
    bubble: Boolean,
    clickable: Boolean,
    extData: ExtraData | js.Object,
    map: Map,
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(bubble = bubble, clickable = clickable, extData = extData.asInstanceOf[js.Any], map = map, strokeColor = strokeColor, strokeDasharray = strokeDasharray, strokeOpacity = strokeOpacity, strokeStyle = strokeStyle, strokeWeight = strokeWeight, zIndex = zIndex)
  
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
}

