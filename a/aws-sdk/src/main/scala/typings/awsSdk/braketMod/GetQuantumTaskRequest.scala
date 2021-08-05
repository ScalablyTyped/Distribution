package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQuantumTaskRequest extends StObject {
  
  /**
    * the ARN of the task to retrieve.
    */
  var quantumTaskArn: QuantumTaskArn
}
object GetQuantumTaskRequest {
  
  inline def apply(quantumTaskArn: QuantumTaskArn): GetQuantumTaskRequest = {
    val __obj = js.Dynamic.literal(quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuantumTaskRequest]
  }
  
  extension [Self <: GetQuantumTaskRequest](x: Self) {
    
    inline def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
