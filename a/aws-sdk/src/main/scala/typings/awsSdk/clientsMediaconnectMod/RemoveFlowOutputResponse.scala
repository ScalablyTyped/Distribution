package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFlowOutputResponse extends StObject {
  
  /**
    * The ARN of the flow that is associated with the output you removed.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the output that was removed.
    */
  var OutputArn: js.UndefOr[string] = js.undefined
}
object RemoveFlowOutputResponse {
  
  inline def apply(): RemoveFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowOutputResponse]
  }
  
  extension [Self <: RemoveFlowOutputResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setOutputArn(value: string): Self = StObject.set(x, "OutputArn", value.asInstanceOf[js.Any])
    
    inline def setOutputArnUndefined: Self = StObject.set(x, "OutputArn", js.undefined)
  }
}
