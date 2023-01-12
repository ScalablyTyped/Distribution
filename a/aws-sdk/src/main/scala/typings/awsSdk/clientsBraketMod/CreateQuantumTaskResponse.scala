package typings.awsSdk.clientsBraketMod

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
  
  inline def apply(quantumTaskArn: QuantumTaskArn): CreateQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQuantumTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQuantumTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
