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
  
  inline def apply(quantumTaskArn: QuantumTaskArn): CreateQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQuantumTaskResponse]
  }
  
  extension [Self <: CreateQuantumTaskResponse](x: Self) {
    
    inline def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
