package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFlowRequest extends StObject {
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName
  
  /**
    *  Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use. 
    */
  var forceDelete: js.UndefOr[Boolean] = js.undefined
}
object DeleteFlowRequest {
  
  inline def apply(flowName: FlowName): DeleteFlowRequest = {
    val __obj = js.Dynamic.literal(flowName = flowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowRequest]
  }
  
  extension [Self <: DeleteFlowRequest](x: Self) {
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    inline def setForceDelete(value: Boolean): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
  }
}
