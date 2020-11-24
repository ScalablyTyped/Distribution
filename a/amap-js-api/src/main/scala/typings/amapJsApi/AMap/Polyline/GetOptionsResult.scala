package typings.amapJsApi.AMap.Polyline

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOptionsResult[ExtraData]
  extends typings.amapJsApi.AMap.ShapeOverlay.GetOptionsResult[ExtraData] {
  
  /**
    * 描边的宽度
    */
  var borderWeight: Double = js.native
  
  /**
    * 方向箭头颜色
    */
  var dirColor: String = js.native
  
  /**
    * 方向箭头图片
    */
  var dirImg: String = js.native
  
  /**
    * 是否绘制成大地线
    */
  var geodesic: Boolean = js.native
  
  /**
    * 线条是否带描边
    */
  var isOutline: Boolean = js.native
  
  /**
    * 折线两端线帽的绘制样式
    */
  var lineCap: StrokeLineCap = js.native
  
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: StrokeLineJoin = js.native
  
  /**
    * 线条描边颜色
    */
  var outlineColor: String = js.native
  
  /**
    * 折线的节点数组
    */
  var path: js.Array[LngLat] = js.native
  
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: Boolean = js.native
}
object GetOptionsResult {
  
  @scala.inline
  def apply[ExtraData](
    borderWeight: Double,
    bubble: Boolean,
    clickable: Boolean,
    dirColor: String,
    dirImg: String,
    extData: ExtraData | js.Object,
    geodesic: Boolean,
    isOutline: Boolean,
    lineCap: StrokeLineCap,
    lineJoin: StrokeLineJoin,
    map: Map,
    outlineColor: String,
    path: js.Array[LngLat],
    showDir: Boolean,
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(borderWeight = borderWeight.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], dirColor = dirColor.asInstanceOf[js.Any], dirImg = dirImg.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], geodesic = geodesic.asInstanceOf[js.Any], isOutline = isOutline.asInstanceOf[js.Any], lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], showDir = showDir.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
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
    def setBorderWeight(value: Double): Self = this.set("borderWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirColor(value: String): Self = this.set("dirColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirImg(value: String): Self = this.set("dirImg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOutline(value: Boolean): Self = this.set("isOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCap(value: StrokeLineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoin(value: StrokeLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LngLat*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDir(value: Boolean): Self = this.set("showDir", value.asInstanceOf[js.Any])
  }
}
