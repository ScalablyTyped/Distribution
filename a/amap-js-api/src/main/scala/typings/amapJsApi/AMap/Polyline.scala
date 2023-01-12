package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline[ExtraData]
  extends StObject
     with PathOverlay[ExtraData] {
  
  /**
    * 获取折线的总长度（单位：米）
    */
  def getLength(): Double = js.native
  
  /**
    * 获取折线路径的节点数组
    */
  def getPath(): /* import warning: importer.ImportType#apply Failed type conversion: this extends / * Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.BezierCurve<any>, keyof amap-js-api.AMap.Polyline<any>> * /
  {readonly getInterpolateLngLats (): std.Array<amap-js-api.AMap.LngLat>,   getInterpolateLngLats :(): std.Array<amap-js-api.AMap.LngLat>, readonly getSerializedPath (): std.Array<std.Array<number>>,   getSerializedPath :(): std.Array<std.Array<number>>} ? std.Array</ * Inlined amap-js-api.AMap.LngLat & {  controlPoints :std.Array<amap-js-api.AMap.LngLat>} * /
  {offset (east : number, north : number): amap-js-api.AMap.LngLat, distance (lnglat : amap-js-api.AMap.LngLat): number, distance (lnglat : std.Array<amap-js-api.AMap.LngLat>): number, getLng (): number, getLat (): number, equals (lnglat : amap-js-api.AMap.LngLat): boolean, toString (): string, add (lnglat : amap-js-api.AMap.LngLat): amap-js-api.AMap.LngLat, add (lnglat : amap-js-api.AMap.LngLat, noAutofix : boolean): amap-js-api.AMap.LngLat, subtract (lnglat : amap-js-api.AMap.LngLat): amap-js-api.AMap.LngLat, subtract (lnglat : amap-js-api.AMap.LngLat, noAutofix : boolean): amap-js-api.AMap.LngLat, divideBy (num : number): amap-js-api.AMap.LngLat, divideBy (num : number, noAutofix : boolean): amap-js-api.AMap.LngLat, multiplyBy (num : number): amap-js-api.AMap.LngLat, multiplyBy (num : number, noAutofix : boolean): amap-js-api.AMap.LngLat,   controlPoints :std.Array<amap-js-api.AMap.LngLat>}> : std.Array<amap-js-api.AMap.LngLat> */ js.Any = js.native
  
  /**
    * 设置线的属性
    * @param options 属性
    */
  def setOptions(
    options: /* import warning: importer.ImportType#apply Failed type conversion: this extends / * Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.BezierCurve<any>, keyof amap-js-api.AMap.Polyline<any>> * /
  {readonly getInterpolateLngLats (): std.Array<amap-js-api.AMap.LngLat>,   getInterpolateLngLats :(): std.Array<amap-js-api.AMap.LngLat>, readonly getSerializedPath (): std.Array<std.Array<number>>,   getSerializedPath :(): std.Array<std.Array<number>>} ? std.Partial<amap-js-api.AMap.BezierCurve.Options<ExtraData>> : amap-js-api.AMap.Polyline.Options<ExtraData> */ js.Any
  ): Unit = js.native
  
  /**
    * 设置组成该折线的节点数组
    * @param path 节点数组
    */
  def setPath(
    path: /* import warning: importer.ImportType#apply Failed type conversion: this extends / * Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.BezierCurve<any>, keyof amap-js-api.AMap.Polyline<any>> * /
  {readonly getInterpolateLngLats (): std.Array<amap-js-api.AMap.LngLat>,   getInterpolateLngLats :(): std.Array<amap-js-api.AMap.LngLat>, readonly getSerializedPath (): std.Array<std.Array<number>>,   getSerializedPath :(): std.Array<std.Array<number>>} ? std.Array<std.Array<number | string | std.Array<string | number>>> : std.Array<amap-js-api.AMap.LocationValue> */ js.Any
  ): Unit = js.native
}
object Polyline {
  
  type EventMap[I] = typings.amapJsApi.AMap.PathOverlay.EventMap[I]
  
  trait GetOptionsResult[ExtraData]
    extends StObject
       with typings.amapJsApi.AMap.ShapeOverlay.GetOptionsResult[ExtraData] {
    
    /**
      * 描边的宽度
      */
    var borderWeight: Double
    
    /**
      * 方向箭头颜色
      */
    var dirColor: String
    
    /**
      * 方向箭头图片
      */
    var dirImg: String
    
    /**
      * 是否绘制成大地线
      */
    var geodesic: Boolean
    
    /**
      * 线条是否带描边
      */
    var isOutline: Boolean
    
    /**
      * 折线两端线帽的绘制样式
      */
    var lineCap: StrokeLineCap
    
    /**
      * 折线拐点的绘制样式
      */
    var lineJoin: StrokeLineJoin
    
    /**
      * 线条描边颜色
      */
    var outlineColor: String
    
    /**
      * 折线的节点数组
      */
    var path: js.Array[LngLat]
    
    /**
      * 是否延路径显示方向箭头
      */
    var showDir: Boolean
  }
  object GetOptionsResult {
    
    inline def apply[ExtraData](
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
    implicit open class MutableBuilder[Self <: GetOptionsResult[?], ExtraData] (val x: Self & GetOptionsResult[ExtraData]) extends AnyVal {
      
      inline def setBorderWeight(value: Double): Self = StObject.set(x, "borderWeight", value.asInstanceOf[js.Any])
      
      inline def setDirColor(value: String): Self = StObject.set(x, "dirColor", value.asInstanceOf[js.Any])
      
      inline def setDirImg(value: String): Self = StObject.set(x, "dirImg", value.asInstanceOf[js.Any])
      
      inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
      
      inline def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
      
      inline def setLineCap(value: StrokeLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[LngLat]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: LngLat*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[ExtraData]
    extends StObject
       with typings.amapJsApi.AMap.PathOverlay.Options[ExtraData] {
    
    /**
      * 描边的宽度
      */
    var borderWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * 方向箭头颜色
      */
    var dirColor: js.UndefOr[String] = js.undefined
    
    /**
      * 是否绘制成大地线
      */
    var geodesic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 线条是否带描边
      */
    var isOutline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 线条描边颜色
      */
    var outlineColor: js.UndefOr[String] = js.undefined
    
    // internal
    /**
      * 折线的节点数组
      */
    var path: js.UndefOr[js.Array[LocationValue]] = js.undefined
    
    /**
      * 是否延路径显示方向箭头
      */
    var showDir: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], ExtraData] (val x: Self & Options[ExtraData]) extends AnyVal {
      
      inline def setBorderWeight(value: Double): Self = StObject.set(x, "borderWeight", value.asInstanceOf[js.Any])
      
      inline def setBorderWeightUndefined: Self = StObject.set(x, "borderWeight", js.undefined)
      
      inline def setDirColor(value: String): Self = StObject.set(x, "dirColor", value.asInstanceOf[js.Any])
      
      inline def setDirColorUndefined: Self = StObject.set(x, "dirColor", js.undefined)
      
      inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
      
      inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
      
      inline def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
      
      inline def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setPath(value: js.Array[LocationValue]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: LocationValue*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
      
      inline def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
    }
  }
}
