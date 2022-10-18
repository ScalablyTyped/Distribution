package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSliderTicksMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/slider/ticks", JSImport.Default)
  @js.native
  val default: FC[TicksProps] = js.native
  
  trait TicksProps extends StObject {
    
    var lowerBound: Double
    
    var max: Double
    
    var min: Double
    
    var points: js.Array[Double]
    
    var upperBound: Double
  }
  object TicksProps {
    
    inline def apply(lowerBound: Double, max: Double, min: Double, points: js.Array[Double], upperBound: Double): TicksProps = {
      val __obj = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
      __obj.asInstanceOf[TicksProps]
    }
    
    extension [Self <: TicksProps](x: Self) {
      
      inline def setLowerBound(value: Double): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setUpperBound(value: Double): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[TicksProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsSliderTicksMod.foo` */
  override def _to: FC[TicksProps] = default
}
