package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.progressProgressMod.ProgressProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Steps", JSImport.Default)
  @js.native
  val default: FC[StepsProps] = js.native
  
  trait StepsProps
    extends StObject
       with ProgressProps {
    
    @JSName("steps")
    var steps_StepsProps: Double
    
    @JSName("strokeColor")
    var strokeColor_StepsProps: js.UndefOr[String] = js.undefined
  }
  object StepsProps {
    
    inline def apply(steps: Double): StepsProps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
  
  type _To = FC[StepsProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepsMod.foo` */
  override def _to: FC[StepsProps] = default
}
