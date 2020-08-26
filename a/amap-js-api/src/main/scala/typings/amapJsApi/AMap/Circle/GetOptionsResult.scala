package typings.amapJsApi.AMap.Circle

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polygon.GetOptionsResult<ExtraData>, {  path :std.Array<amap-js-api.AMap.LngLat>,   center :amap-js-api.AMap.LngLat,   radius :number}> */
@js.native
trait GetOptionsResult[ExtraData] extends js.Object {
  /**
    * 事件是否穿透到地图
    */
  var bubble: Boolean = js.native
  var center: LngLat = js.native
  /**
    * 是否支持点击
    */
  var clickable: Boolean = js.native
  /**
    * 自定义属性
    */
  var extData: ExtraData | js.Object = js.native
  /**
    * 多边形填充颜色
    */
  var fillColor: String = js.native
  /**
    * 边形填充透明度
    */
  var fillOpacity: Double = js.native
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: StrokeLineJoin = js.native
  /**
    * 所属地图
    */
  var map: Map = js.native
  /**
    * 多边形轮廓线的节点坐标数组
    */
  var path: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat] = js.native
  var radius: Double = js.native
  /**
    * 线条颜色
    */
  var strokeColor: String = js.native
  /**
    * 虚线的分段
    */
  var strokeDasharray: js.Array[Double] = js.native
  /**
    * 线条透明度
    */
  var strokeOpacity: Double = js.native
  /**
    * 线条样式，虚线或者实线
    */
  var strokeStyle: StrokeStyle = js.native
  /**
    * 线条宽度
    */
  var strokeWeight: Double = js.native
  var texture: String = js.native
  /**
    * 层级
    */
  var zIndex: Double = js.native
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
  @scala.inline
  implicit class GetOptionsResultOps[Self <: GetOptionsResult[_], ExtraData] (val x: Self with GetOptionsResult[ExtraData]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBubble(value: Boolean): Self = this.set("bubble", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: LngLat): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtData(value: ExtraData | js.Object): Self = this.set("extData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineJoin(value: StrokeLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeDasharrayVarargs(value: Double*): Self = this.set("strokeDasharray", js.Array(value :_*))
    @scala.inline
    def setStrokeDasharray(value: js.Array[Double]): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeStyle(value: StrokeStyle): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture(value: String): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
  
}

