package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCalculationExecutionRequest extends StObject {
  
  /**
    * The calculation execution UUID.
    */
  var CalculationExecutionId: typings.awsSdk.clientsAthenaMod.CalculationExecutionId
}
object StopCalculationExecutionRequest {
  
  inline def apply(CalculationExecutionId: CalculationExecutionId): StopCalculationExecutionRequest = {
    val __obj = js.Dynamic.literal(CalculationExecutionId = CalculationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCalculationExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopCalculationExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setCalculationExecutionId(value: CalculationExecutionId): Self = StObject.set(x, "CalculationExecutionId", value.asInstanceOf[js.Any])
  }
}
