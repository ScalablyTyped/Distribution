package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelQuantumTaskRequest extends js.Object {
  
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
  implicit class CancelQuantumTaskRequestOps[Self <: CancelQuantumTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientToken(value: String64): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = this.set("quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
