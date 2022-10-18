package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowResponse extends StObject {
  
  /**
    *  The flow's Amazon Resource Name (ARN). 
    */
  var flowArn: js.UndefOr[FlowArn] = js.undefined
  
  /**
    *  Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.undefined
}
object CreateFlowResponse {
  
  inline def apply(): CreateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowResponse]
  }
  
  extension [Self <: CreateFlowResponse](x: Self) {
    
    inline def setFlowArn(value: FlowArn): Self = StObject.set(x, "flowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "flowArn", js.undefined)
    
    inline def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    inline def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
  }
}
