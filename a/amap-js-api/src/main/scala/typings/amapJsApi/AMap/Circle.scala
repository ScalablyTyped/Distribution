package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Circle.Options
import typings.amapJsApi.amapJsApiStrings.change
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.hide
import typings.amapJsApi.amapJsApiStrings.meter
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.options
import typings.amapJsApi.amapJsApiStrings.px
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.setCenter
import typings.amapJsApi.amapJsApiStrings.setRadius
import typings.amapJsApi.amapJsApiStrings.show
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.anon.TargetI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle[ExtraData] extends ShapeOverlay[ExtraData] {
  
  /**
    * 判断指定点坐标是否在圆内
    * @param point 坐标
    */
  def contains(point: LocationValue): Boolean = js.native
  
  /**
    * 获取圆外切矩形范围
    */
  def getBounds(): Bounds | Null = js.native
  
  /**
    * 获取圆中心点
    */
  def getCenter(): js.UndefOr[LngLat] = js.native
  
  // internal
  def getPath(): js.Array[LngLat] = js.native
  def getPath(count: Double): js.Array[LngLat] = js.native
  
  /**
    * 获取圆形的半径
    */
  def getRadius(): Double = js.native
  
  /**
    * 设置圆中心点
    * @param center 中心点经纬度
    * @param preventEvent 阻止触发事件
    */
  def setCenter(center: LocationValue): Unit = js.native
  def setCenter(center: LocationValue, preventEvent: Boolean): Unit = js.native
  
  /**
    * 修改选项
    * @param options 选项
    */
  def setOptions(): Unit = js.native
  def setOptions(options: Options[ExtraData]): Unit = js.native
  
  /**
    * 设置圆形的半径
    * @param radius 半径
    * @param preventEvent 阻止触发事件
    */
  def setRadius(radius: Double): Unit = js.native
  def setRadius(radius: Double, preventEvent: Boolean): Unit = js.native
}
object Circle {
  
  @js.native
  trait EventMap[I]
    extends typings.amapJsApi.AMap.ShapeOverlay.EventMap[I] {
    
    var setCenter: Event_[typings.amapJsApi.amapJsApiStrings.setCenter, js.UndefOr[scala.Nothing]] = js.native
    
    var setRadius: Event_[typings.amapJsApi.amapJsApiStrings.setRadius, js.UndefOr[scala.Nothing]] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply[I](
      change: Event_[change, TargetI[I]],
      click: MapsEvent[click, I],
      dblclick: MapsEvent[dblclick, I],
      hide: Event_[hide, TargetI[I]],
      mousedown: MapsEvent[mousedown, I],
      mousemove: MapsEvent[mousemove, I],
      mouseover: MapsEvent[mouseover, I],
      mouseup: MapsEvent[mouseup, I],
      options: Event_[options, js.UndefOr[scala.Nothing]],
      rightclick: MapsEvent[rightclick, I],
      setCenter: Event_[setCenter, js.UndefOr[scala.Nothing]],
      setRadius: Event_[setRadius, js.UndefOr[scala.Nothing]],
      show: Event_[show, TargetI[I]],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], setCenter = setCenter.asInstanceOf[js.Any], setRadius = setRadius.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setSetCenter(value: Event_[setCenter, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "setCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRadius(value: Event_[setRadius, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "setRadius", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polygon.GetOptionsResult<ExtraData>, {  path :std.Array<amap-js-api.AMap.LngLat>,   center :amap-js-api.AMap.LngLat,   radius :number}> */
  @js.native
  trait GetOptionsResult[ExtraData] extends StObject {
    
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
    implicit class GetOptionsResultMutableBuilder[Self <: GetOptionsResult[_], ExtraData] (val x: Self with GetOptionsResult[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter(value: LngLat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtData(value: ExtraData | js.Object): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: (js.Array[js.Array[LngLat] | LngLat]) with js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyle(value: StrokeStyle): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTexture(value: String): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options[ExtraData] extends StObject {
    
    var bubble: js.UndefOr[Boolean] = js.native
    
    var center: js.UndefOr[LocationValue] = js.native
    
    var cursor: js.UndefOr[String] = js.native
    
    var extData: js.UndefOr[ExtraData] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var map: js.UndefOr[Map] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var strokeColor: js.UndefOr[String] = js.native
    
    var strokeDasharray: js.UndefOr[js.Array[Double]] = js.native
    
    var strokeOpacity: js.UndefOr[Double] = js.native
    
    var strokeStyle: js.UndefOr[StrokeStyle] = js.native
    
    var strokeWeight: js.UndefOr[Double] = js.native
    
    var unit: js.UndefOr[meter | px] = js.native
    
    // internal
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
      
      @scala.inline
      def setCenter(value: LocationValue): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setExtData(value: ExtraData): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtDataUndefined: Self = StObject.set(x, "extData", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeStyle(value: StrokeStyle): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      @scala.inline
      def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      @scala.inline
      def setUnit(value: meter | px): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
