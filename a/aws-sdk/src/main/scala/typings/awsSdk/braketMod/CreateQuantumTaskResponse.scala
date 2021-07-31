package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuantumTaskResponse extends StObject {
  
  /**
    * The ARN of the task created by the request.
    */
  var quantumTaskArn: QuantumTaskArn
}
object CreateQuantumTaskResponse {
  
  @scala.inline
  def apply(quantumTaskArn: QuantumTaskArn): CreateQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQuantumTaskResponse]
  }
  
  @scala.inline
  implicit class CreateQuantumTaskResponseMutableBuilder[Self <: CreateQuantumTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
