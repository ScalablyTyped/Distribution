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
    
    inline def apply(container: IGroup): TrendCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrendCfg]
    }
    
    extension [Self <: TrendCfg](x: Self) {
      
      inline def setAreaStyle(value: js.Object): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
      
      inline def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
      
      inline def setBackgroundStyle(value: js.Object): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsArea(value: Boolean): Self = StObject.set(x, "isArea", value.asInstanceOf[js.Any])
      
      inline def setIsAreaUndefined: Self = StObject.set(x, "isArea", js.undefined)
      
      inline def setLineStyle(value: js.Object): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
