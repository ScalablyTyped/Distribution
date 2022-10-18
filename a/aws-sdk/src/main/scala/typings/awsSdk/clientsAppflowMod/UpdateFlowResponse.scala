package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowResponse extends StObject {
  
  /**
    * Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.undefined
}
object UpdateFlowResponse {
  
  inline def apply(): UpdateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowResponse]
  }
  
  extension [Self <: UpdateFlowResponse](x: Self) {
    
    inline def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    inline def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
  }
}
