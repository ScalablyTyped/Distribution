package typings.antDesignPro

import typings.antDesignPro.anon.Label
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsRadarMod {
  
  @JSImport("ant-design-pro/lib/Charts/Radar", JSImport.Default)
  @js.native
  open class default () extends Component[IRadarProps, Any, Any]
  
  trait IRadarProps extends StObject {
    
    var data: js.Array[Label]
    
    var hasLegend: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object IRadarProps {
    
    inline def apply(data: js.Array[Label], height: Double): IRadarProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRadarProps]
    }
    
    extension [Self <: IRadarProps](x: Self) {
      
      inline def setData(value: js.Array[Label]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Label*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHasLegend(value: Boolean): Self = StObject.set(x, "hasLegend", value.asInstanceOf[js.Any])
      
      inline def setHasLegendUndefined: Self = StObject.set(x, "hasLegend", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type Radar = Component[IRadarProps, Any, Any]
}
