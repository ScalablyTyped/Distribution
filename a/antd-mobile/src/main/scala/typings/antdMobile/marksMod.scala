package typings.antdMobile

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marksMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/slider/marks", JSImport.Default)
  @js.native
  val default: FC[MarksProps] = js.native
  
  trait MarksProps extends StObject {
    
    var lowerBound: Double
    
    var marks: SliderMarks
    
    var max: Double
    
    var min: Double
    
    var upperBound: Double
  }
  object MarksProps {
    
    inline def apply(lowerBound: Double, marks: SliderMarks, max: Double, min: Double, upperBound: Double): MarksProps = {
      val __obj = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarksProps]
    }
    
    extension [Self <: MarksProps](x: Self) {
      
      inline def setLowerBound(value: Double): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
      
      inline def setMarks(value: SliderMarks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setUpperBound(value: Double): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    }
  }
  
  type SliderMarks = NumberDictionary[ReactNode]
  
  type _To = FC[MarksProps]
  
  /* This means you don't have to write `default`, but can instead just say `marksMod.foo` */
  override def _to: FC[MarksProps] = default
}
