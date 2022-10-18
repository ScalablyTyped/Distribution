package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libProgressProgressMod.ProgressProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressStepsMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Steps", JSImport.Default)
  @js.native
  val default: FC[ProgressStepsProps] = js.native
  
  trait ProgressStepsProps
    extends StObject
       with ProgressProps {
    
    @JSName("steps")
    var steps_ProgressStepsProps: Double
    
    @JSName("strokeColor")
    var strokeColor_ProgressStepsProps: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ProgressStepsProps {
    
    inline def apply(steps: Double): ProgressStepsProps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressStepsProps]
    }
    
    extension [Self <: ProgressStepsProps](x: Self) {
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String | js.Array[String]): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value*))
    }
  }
  
  type _To = FC[ProgressStepsProps]
  
  /* This means you don't have to write `default`, but can instead just say `libProgressStepsMod.foo` */
  override def _to: FC[ProgressStepsProps] = default
}
