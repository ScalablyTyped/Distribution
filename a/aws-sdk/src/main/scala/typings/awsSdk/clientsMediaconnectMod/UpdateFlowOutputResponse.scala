package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowOutputResponse extends StObject {
  
  /**
    * The ARN of the flow that is associated with the updated output.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The new settings of the output that you updated.
    */
  var Output: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Output] = js.undefined
}
object UpdateFlowOutputResponse {
  
  inline def apply(): UpdateFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowOutputResponse]
  }
  
  extension [Self <: UpdateFlowOutputResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setOutput(value: Output): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
  }
}
