package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathOverlay[ExtraData]
  extends StObject
     with ShapeOverlay[ExtraData] {
  
  /**
    * 获取范围
    */
  def getBounds(): Bounds | (/* import warning: importer.ImportType#apply Failed type conversion: this extends amap-js-api.AMap.Rectangle<any> ? undefined : null */ js.Any) = js.native
}
object PathOverlay {
  
  type EventMap[I] = typings.amapJsApi.AMap.ShapeOverlay.EventMap[I]
  
  trait Options[ExtraData]
    extends StObject
       with typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
    
    /**
      * 折线两端线帽的绘制样式
      */
    var lineCap: js.UndefOr[StrokeLineCap] = js.undefined
    
    /**
      * 折线拐点的绘制样式
      */
    var lineJoin: js.UndefOr[StrokeLineJoin] = js.undefined
    
    /**
      * 描边线条颜色
      */
    var strokeColor: js.UndefOr[String] = js.undefined
    
    /**
      * 虚线间隔
      */
    var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * 描边线条透明度
      */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * 描边样式
      */
    var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
    
    /**
      * 描边宽度
      */
    var strokeWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * 是否可见
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 覆盖物层级
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    extension [Self <: Options[?], ExtraData](x: Self & Options[ExtraData]) {
      
      inline def setLineCap(value: StrokeLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value*))
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeStyle(value: StrokeStyle): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
