package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowOutputsResponse extends StObject {
  
  /**
    * The ARN of the flow that these outputs were added to.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The details of the newly added outputs.
    */
  var Outputs: js.UndefOr[listOfOutput] = js.undefined
}
object AddFlowOutputsResponse {
  
  inline def apply(): AddFlowOutputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowOutputsResponse]
  }
  
  extension [Self <: AddFlowOutputsResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setOutputs(value: listOfOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value*))
  }
}
