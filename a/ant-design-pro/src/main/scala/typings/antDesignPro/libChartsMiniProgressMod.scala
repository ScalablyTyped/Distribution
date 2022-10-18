package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsMiniProgressMod {
  
  @JSImport("ant-design-pro/lib/Charts/MiniProgress", JSImport.Default)
  @js.native
  open class default () extends Component[IMiniProgressProps, Any, Any]
  
  trait IMiniProgressProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: Double
    
    var targetLabel: String
  }
  object IMiniProgressProps {
    
    inline def apply(target: Double, targetLabel: String): IMiniProgressProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMiniProgressProps]
    }
    
    extension [Self <: IMiniProgressProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetLabel(value: String): Self = StObject.set(x, "targetLabel", value.asInstanceOf[js.Any])
    }
  }
  
  type MiniProgress = Component[IMiniProgressProps, Any, Any]
}
