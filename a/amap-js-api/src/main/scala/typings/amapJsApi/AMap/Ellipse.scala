package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Ellipse.Options
import typings.amapJsApi.amapJsApiStrings.change
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.hide
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.options
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.setCenter
import typings.amapJsApi.amapJsApiStrings.setPath
import typings.amapJsApi.amapJsApiStrings.show
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.anon.TargetI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipse[ExtraData]
  extends StObject
     with Polygon[ExtraData] {
  
  /**
    * 获取椭圆的中心点
    */
  def getCenter(): js.UndefOr[LngLat] = js.native
  
  def getRadius(): js.Tuple2[Double, Double] = js.native
  
  /**
    * 设置椭圆的中心点
    * @param center 中心点
    * @param preventEvent 阻止触发事件
    */
  def setCenter(center: LocationValue): Unit = js.native
  def setCenter(center: LocationValue, preventEvent: Boolean): Unit = js.native
  
  /**
    * 修改椭圆属性
    * @param options 属性
    */
  def setOptions(options: Options[ExtraData]): Unit = js.native
  
  // internal
  def setRadius(radius: js.Tuple2[Double, Double]): Unit = js.native
  def setRadius(radius: js.Tuple2[Double, Double], preventEvent: Boolean): Unit = js.native
}
object Ellipse {
  
  trait EventMap[I]
    extends StObject
       with typings.amapJsApi.AMap.ShapeOverlay.EventMap[I] {
    
    var setCenter: Event_[typings.amapJsApi.amapJsApiStrings.setCenter, Unit]
    
    var setPath: Event_[typings.amapJsApi.amapJsApiStrings.setPath, Unit]
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
      options: Event_[options, Unit],
      rightclick: MapsEvent[rightclick, I],
      setCenter: Event_[setCenter, Unit],
      setPath: Event_[setPath, Unit],
      show: Event_[show, TargetI[I]],
      touchend: MapsEvent[touchend, I],
      touchmove: MapsEvent[touchmove, I],
      touchstart: MapsEvent[touchstart, I]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], setCenter = setCenter.asInstanceOf[js.Any], setPath = setPath.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[?], I] (val x: Self & EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setSetCenter(value: Event_[setCenter, Unit]): Self = StObject.set(x, "setCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetPath(value: Event_[setPath, Unit]): Self = StObject.set(x, "setPath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Circle.GetOptionsResult<ExtraData>, {  radius :[number, number]}> */
  trait GetOptionsResult[ExtraData] extends StObject {
    
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
    var path: (js.Array[js.Array[LngLat] | LngLat]) & js.Array[LngLat]
    
    var radius: Double & (js.Tuple2[Double, Double])
    
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
      path: (js.Array[js.Array[LngLat] | LngLat]) & js.Array[LngLat],
      radius: Double & (js.Tuple2[Double, Double]),
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
    implicit class GetOptionsResultMutableBuilder[Self <: GetOptionsResult[?], ExtraData] (val x: Self & GetOptionsResult[ExtraData]) extends AnyVal {
      
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
      def setPath(value: (js.Array[js.Array[LngLat] | LngLat]) & js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double & (js.Tuple2[Double, Double])): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
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
  
  trait Options[ExtraData]
    extends StObject
       with typings.amapJsApi.AMap.Polygon.Options[ExtraData] {
    
    /**
      * 椭圆的中心
      */
    var center: js.UndefOr[LocationValue] = js.undefined
    
    /**
      * 椭圆半径
      */
    var radius: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], ExtraData] (val x: Self & Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setCenter(value: LocationValue): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setRadius(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
