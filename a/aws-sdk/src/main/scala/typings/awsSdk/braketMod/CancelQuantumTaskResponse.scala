package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelQuantumTaskResponse extends StObject {
  
  /**
    * The status of the cancellation request.
    */
  var cancellationStatus: CancellationStatus
  
  /**
    * The ARN of the task.
    */
  var quantumTaskArn: QuantumTaskArn
}
object CancelQuantumTaskResponse {
  
  @scala.inline
  def apply(cancellationStatus: CancellationStatus, quantumTaskArn: QuantumTaskArn): CancelQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(cancellationStatus = cancellationStatus.asInstanceOf[js.Any], quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQuantumTaskResponse]
  }
  
  @scala.inline
  implicit class CancelQuantumTaskResponseMutableBuilder[Self <: CancelQuantumTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancellationStatus(value: CancellationStatus): Self = StObject.set(x, "cancellationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
