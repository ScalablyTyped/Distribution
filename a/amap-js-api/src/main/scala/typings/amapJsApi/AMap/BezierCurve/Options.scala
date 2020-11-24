package typings.amapJsApi.AMap.BezierCurve

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polyline.Options<ExtraData>, {  path :std.Array<std.Array<number | string | std.Array<string | number>>>,   tolerance :number | undefined,   interpolateNumLimit :[number] | undefined}> */
@js.native
trait Options[ExtraData] extends js.Object {
  
  /**
    * 描边的宽度
    */
  var borderWeight: js.UndefOr[Double] = js.native
  
  /**
    * 事件是否穿透到地图
    */
  var bubble: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否支持点击
    */
  var clickable: js.UndefOr[Boolean] = js.native
  
  /**
    * 鼠标悬停时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * 方向箭头颜色
    */
  var dirColor: js.UndefOr[String] = js.native
  
  /**
    * 是否支持拖拽
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * 自定义数据
    */
  var extData: js.UndefOr[ExtraData] = js.native
  
  /**
    * 是否绘制成大地线
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  
  var interpolateNumLimit: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * 线条是否带描边
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  
  /**
    * 折线两端线帽的绘制样式
    */
  var lineCap: js.UndefOr[StrokeLineCap] = js.native
  
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.native
  
  /**
    * 所属地图
    */
  var map: js.UndefOr[Map] = js.native
  
  /**
    * 线条描边颜色
    */
  var outlineColor: js.UndefOr[String] = js.native
  
  // internal
  /**
    * 折线的节点数组
    */
  /**
    * 贝瑟尔曲线的路径
    */
  var path: js.UndefOr[js.Array[LocationValue]] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]]) = js.native
  
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: js.UndefOr[Boolean] = js.native
  
  /**
    * 描边线条颜色
    */
  var strokeColor: js.UndefOr[String] = js.native
  
  /**
    * 虚线间隔
    */
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * 描边线条透明度
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * 描边样式
    */
  var strokeStyle: js.UndefOr[StrokeStyle] = js.native
  
  /**
    * 描边宽度
    */
  var strokeWeight: js.UndefOr[Double] = js.native
  
  // internal
  var tolerance: js.UndefOr[Double] = js.native
  
  /**
    * 是否可见
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * 覆盖物层级
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply[ExtraData](
    path: js.UndefOr[js.Array[LocationValue]] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]])
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ExtraData]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
    
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
    def setPath(
      value: js.UndefOr[js.Array[LocationValue]] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]])
    ): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWeight(value: Double): Self = this.set("borderWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWeight: Self = this.set("borderWeight", js.undefined)
    
    @scala.inline
    def setBubble(value: Boolean): Self = this.set("bubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDirColor(value: String): Self = this.set("dirColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirColor: Self = this.set("dirColor", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setExtData(value: ExtraData): Self = this.set("extData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtData: Self = this.set("extData", js.undefined)
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    
    @scala.inline
    def setInterpolateNumLimitVarargs(value: Double*): Self = this.set("interpolateNumLimit", js.Array(value :_*))
    
    @scala.inline
    def setInterpolateNumLimit(value: js.Array[Double]): Self = this.set("interpolateNumLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolateNumLimit: Self = this.set("interpolateNumLimit", js.undefined)
    
    @scala.inline
    def setIsOutline(value: Boolean): Self = this.set("isOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOutline: Self = this.set("isOutline", js.undefined)
    
    @scala.inline
    def setLineCap(value: StrokeLineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setLineJoin(value: StrokeLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setShowDir(value: Boolean): Self = this.set("showDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDir: Self = this.set("showDir", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeDasharrayVarargs(value: Double*): Self = this.set("strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDasharray(value: js.Array[Double]): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: StrokeStyle): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
