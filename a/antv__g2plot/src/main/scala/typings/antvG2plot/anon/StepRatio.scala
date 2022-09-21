package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepRatio extends StObject {
  
  /**
    * @title step 与 gap 的宽度占比
    * @default "0.5"
    */
  val stepRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 仪表盘总步数
    * @default "50"
    */
  val steps: js.UndefOr[Double] = js.undefined
}
object StepRatio {
  
  inline def apply(): StepRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepRatio]
  }
  
  extension [Self <: StepRatio](x: Self) {
    
    inline def setStepRatio(value: Double): Self = StObject.set(x, "stepRatio", value.asInstanceOf[js.Any])
    
    inline def setStepRatioUndefined: Self = StObject.set(x, "stepRatio", js.undefined)
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
