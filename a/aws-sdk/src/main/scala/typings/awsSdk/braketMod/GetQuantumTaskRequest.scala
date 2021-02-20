package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQuantumTaskRequest extends StObject {
  
  /**
    * the ARN of the task to retrieve.
    */
  var quantumTaskArn: QuantumTaskArn = js.native
}
object GetQuantumTaskRequest {
  
  @scala.inline
  def apply(quantumTaskArn: QuantumTaskArn): GetQuantumTaskRequest = {
    val __obj = js.Dynamic.literal(quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuantumTaskRequest]
  }
  
  @scala.inline
  implicit class GetQuantumTaskRequestMutableBuilder[Self <: GetQuantumTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
