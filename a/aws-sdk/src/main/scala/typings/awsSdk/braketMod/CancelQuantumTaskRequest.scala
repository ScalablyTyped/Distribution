package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelQuantumTaskRequest extends StObject {
  
  /**
    * The client token associated with the request.
    */
  var clientToken: String64 = js.native
  
  /**
    * The ARN of the task to cancel.
    */
  var quantumTaskArn: QuantumTaskArn = js.native
}
object CancelQuantumTaskRequest {
  
  @scala.inline
  def apply(clientToken: String64, quantumTaskArn: QuantumTaskArn): CancelQuantumTaskRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQuantumTaskRequest]
  }
  
  @scala.inline
  implicit class CancelQuantumTaskRequestMutableBuilder[Self <: CancelQuantumTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String64): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
