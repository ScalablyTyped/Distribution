package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLinearScale extends StObject {
  
  /**
    * The step count setup of a linear axis.
    */
  var StepCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The step size setup of a linear axis.
    */
  var StepSize: js.UndefOr[Double] = js.undefined
}
object AxisLinearScale {
  
  inline def apply(): AxisLinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLinearScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLinearScale] (val x: Self) extends AnyVal {
    
    inline def setStepCount(value: Integer): Self = StObject.set(x, "StepCount", value.asInstanceOf[js.Any])
    
    inline def setStepCountUndefined: Self = StObject.set(x, "StepCount", js.undefined)
    
    inline def setStepSize(value: Double): Self = StObject.set(x, "StepSize", value.asInstanceOf[js.Any])
    
    inline def setStepSizeUndefined: Self = StObject.set(x, "StepSize", js.undefined)
  }
}
