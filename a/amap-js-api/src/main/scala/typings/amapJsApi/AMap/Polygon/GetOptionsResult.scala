package typings.amapJsApi.AMap.Polygon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptionsResult[ExtraData]
  extends typings.amapJsApi.AMap.ShapeOverlay.GetOptionsResult[ExtraData] {
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
    * 多边形轮廓线的节点坐标数组
    */
  var path: js.Array[js.Array[LngLat] | LngLat] = js.native
  var texture: String = js.native
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
    val __obj = js.Dynamic.literal(bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineJoin(value: StrokeLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: (js.Array[LngLat] | LngLat)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[js.Array[LngLat] | LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture(value: String): Self = this.set("texture", value.asInstanceOf[js.Any])
  }
  
}

