package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelQuantumTaskResponse extends js.Object {
  
  /**
    * The status of the cancellation request.
    */
  var cancellationStatus: CancellationStatus = js.native
  
  /**
    * The ARN of the task.
    */
  var quantumTaskArn: QuantumTaskArn = js.native
}
object CancelQuantumTaskResponse {
  
  @scala.inline
  def apply(cancellationStatus: CancellationStatus, quantumTaskArn: QuantumTaskArn): CancelQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(cancellationStatus = cancellationStatus.asInstanceOf[js.Any], quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQuantumTaskResponse]
  }
  
  @scala.inline
  implicit class CancelQuantumTaskResponseOps[Self <: CancelQuantumTaskResponse] (val x: Self) extends AnyVal {
    
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
    def setCancellationStatus(value: CancellationStatus): Self = this.set("cancellationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = this.set("quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
