package typings.antvComponent

import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trendMod {
  
  @JSImport("@antv/component/lib/trend/trend", JSImport.Default)
  @js.native
  class default () extends Trend
  
  @JSImport("@antv/component/lib/trend/trend", "Trend")
  @js.native
  class Trend ()
    extends typings.antvComponent.groupComponentMod.default[TrendCfg]
  
  trait TrendCfg
    extends StObject
       with GroupComponentCfg {
    
    val areaStyle: js.UndefOr[js.Object] = js.undefined
    
    val backgroundStyle: js.UndefOr[js.Object] = js.undefined
    
    val data: js.UndefOr[js.Array[Double]] = js.undefined
    
    val height: js.UndefOr[Double] = js.undefined
    
    val isArea: js.UndefOr[Boolean] = js.undefined
    
    val lineStyle: js.UndefOr[js.Object] = js.undefined
    
    val smooth: js.UndefOr[Boolean] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
    
    val x: js.UndefOr[Double] = js.undefined
    
    val y: js.UndefOr[Double] = js.undefined
  }
  object TrendCfg {
    
    @scala.inline
    def apply(container: IGroup): TrendCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrendCfg]
    }
    
    @scala.inline
    implicit class TrendCfgMutableBuilder[Self <: TrendCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAreaStyle(value: js.Object): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
      
      @scala.inline
      def setBackgroundStyle(value: js.Object): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsArea(value: Boolean): Self = StObject.set(x, "isArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAreaUndefined: Self = StObject.set(x, "isArea", js.undefined)
      
      @scala.inline
      def setLineStyle(value: js.Object): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
