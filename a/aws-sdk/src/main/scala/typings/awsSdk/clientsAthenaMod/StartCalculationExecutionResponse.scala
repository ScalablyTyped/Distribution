package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCalculationExecutionResponse extends StObject {
  
  /**
    * The calculation execution UUID.
    */
  var CalculationExecutionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.CalculationExecutionId] = js.undefined
  
  /**
    *  CREATING - The calculation is in the process of being created.  CREATED - The calculation has been created and is ready to run.  QUEUED - The calculation has been queued for processing.  RUNNING - The calculation is running.  CANCELING - A request to cancel the calculation has been received and the system is working to stop it.  CANCELED - The calculation is no longer running as the result of a cancel request.  COMPLETED - The calculation has completed without error.  FAILED - The calculation failed and is no longer running.
    */
  var State: js.UndefOr[CalculationExecutionState] = js.undefined
}
object StartCalculationExecutionResponse {
  
  inline def apply(): StartCalculationExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCalculationExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartCalculationExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setCalculationExecutionId(value: CalculationExecutionId): Self = StObject.set(x, "CalculationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setCalculationExecutionIdUndefined: Self = StObject.set(x, "CalculationExecutionId", js.undefined)
    
    inline def setState(value: CalculationExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
