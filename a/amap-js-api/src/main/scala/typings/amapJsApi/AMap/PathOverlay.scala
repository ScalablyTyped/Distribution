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
  def getBounds(): js.UndefOr[Bounds | Null] = js.native
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
    
    @scala.inline
    def apply[ExtraData](): Options[ExtraData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ExtraData]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], ExtraData] (val x: Self & Options[ExtraData]) extends AnyVal {
      
      @scala.inline
      def setLineCap(value: StrokeLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
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
