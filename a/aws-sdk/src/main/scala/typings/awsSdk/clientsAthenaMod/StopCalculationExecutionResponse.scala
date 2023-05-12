package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCalculationExecutionResponse extends StObject {
  
  /**
    *  CREATING - The calculation is in the process of being created.  CREATED - The calculation has been created and is ready to run.  QUEUED - The calculation has been queued for processing.  RUNNING - The calculation is running.  CANCELING - A request to cancel the calculation has been received and the system is working to stop it.  CANCELED - The calculation is no longer running as the result of a cancel request.  COMPLETED - The calculation has completed without error.  FAILED - The calculation failed and is no longer running.
    */
  var State: js.UndefOr[CalculationExecutionState] = js.undefined
}
object StopCalculationExecutionResponse {
  
  inline def apply(): StopCalculationExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopCalculationExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopCalculationExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setState(value: CalculationExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
