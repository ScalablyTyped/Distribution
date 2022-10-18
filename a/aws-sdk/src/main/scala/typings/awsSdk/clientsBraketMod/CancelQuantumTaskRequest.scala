package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelQuantumTaskRequest extends StObject {
  
  /**
    * The client token associated with the request.
    */
  var clientToken: String64
  
  /**
    * The ARN of the task to cancel.
    */
  var quantumTaskArn: QuantumTaskArn
}
object CancelQuantumTaskRequest {
  
  inline def apply(clientToken: String64, quantumTaskArn: QuantumTaskArn): CancelQuantumTaskRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQuantumTaskRequest]
  }
  
  extension [Self <: CancelQuantumTaskRequest](x: Self) {
    
    inline def setClientToken(value: String64): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
