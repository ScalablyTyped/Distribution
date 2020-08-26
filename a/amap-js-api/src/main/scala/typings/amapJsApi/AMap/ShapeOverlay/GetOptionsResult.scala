package typings.amapJsApi.AMap.ShapeOverlay

import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptionsResult[ExtraData] extends js.Object {
  /**
    * 事件是否穿透到地图
    */
  var bubble: Boolean = js.native
  /**
    * 是否支持点击
    */
  var clickable: Boolean = js.native
  /**
    * 自定义属性
    */
  var extData: ExtraData | js.Object = js.native
  /**
    * 所属地图
    */
  var map: Map = js.native
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
  /**
    * 层级
    */
  var zIndex: Double = js.native
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
    val __obj = js.Dynamic.literal(bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
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
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtData(value: ExtraData | js.Object): Self = this.set("extData", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
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
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
  
}

