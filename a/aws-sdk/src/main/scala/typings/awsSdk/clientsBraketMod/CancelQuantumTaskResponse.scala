package typings.awsSdk.clientsBraketMod

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
  
  inline def apply(cancellationStatus: CancellationStatus, quantumTaskArn: QuantumTaskArn): CancelQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(cancellationStatus = cancellationStatus.asInstanceOf[js.Any], quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQuantumTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelQuantumTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setCancellationStatus(value: CancellationStatus): Self = StObject.set(x, "cancellationStatus", value.asInstanceOf[js.Any])
    
    inline def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
