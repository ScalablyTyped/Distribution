package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowOutputsRequest extends StObject {
  
  /**
    * The flow that you want to add outputs to.
    */
  var FlowArn: string
  
  /**
    * A list of outputs that you want to add.
    */
  var Outputs: listOfAddOutputRequest
}
object AddFlowOutputsRequest {
  
  inline def apply(FlowArn: string, Outputs: listOfAddOutputRequest): AddFlowOutputsRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowOutputsRequest]
  }
  
  extension [Self <: AddFlowOutputsRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: listOfAddOutputRequest): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: AddOutputRequest*): Self = StObject.set(x, "Outputs", js.Array(value*))
  }
}
