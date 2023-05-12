package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalculationExecutionRequest extends StObject {
  
  /**
    * The calculation execution UUID.
    */
  var CalculationExecutionId: typings.awsSdk.clientsAthenaMod.CalculationExecutionId
}
object GetCalculationExecutionRequest {
  
  inline def apply(CalculationExecutionId: CalculationExecutionId): GetCalculationExecutionRequest = {
    val __obj = js.Dynamic.literal(CalculationExecutionId = CalculationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCalculationExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCalculationExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setCalculationExecutionId(value: CalculationExecutionId): Self = StObject.set(x, "CalculationExecutionId", value.asInstanceOf[js.Any])
  }
}
