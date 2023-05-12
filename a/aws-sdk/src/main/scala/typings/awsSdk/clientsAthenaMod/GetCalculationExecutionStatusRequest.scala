package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalculationExecutionStatusRequest extends StObject {
  
  /**
    * The calculation execution UUID.
    */
  var CalculationExecutionId: typings.awsSdk.clientsAthenaMod.CalculationExecutionId
}
object GetCalculationExecutionStatusRequest {
  
  inline def apply(CalculationExecutionId: CalculationExecutionId): GetCalculationExecutionStatusRequest = {
    val __obj = js.Dynamic.literal(CalculationExecutionId = CalculationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCalculationExecutionStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCalculationExecutionStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setCalculationExecutionId(value: CalculationExecutionId): Self = StObject.set(x, "CalculationExecutionId", value.asInstanceOf[js.Any])
  }
}
