package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantFlowEntitlementsRequest extends StObject {
  
  /**
    * The list of entitlements that you want to grant.
    */
  var Entitlements: listOfGrantEntitlementRequest
  
  /**
    * The flow that you want to grant entitlements on.
    */
  var FlowArn: string
}
object GrantFlowEntitlementsRequest {
  
  inline def apply(Entitlements: listOfGrantEntitlementRequest, FlowArn: string): GrantFlowEntitlementsRequest = {
    val __obj = js.Dynamic.literal(Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantFlowEntitlementsRequest]
  }
  
  extension [Self <: GrantFlowEntitlementsRequest](x: Self) {
    
    inline def setEntitlements(value: listOfGrantEntitlementRequest): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsVarargs(value: GrantEntitlementRequest*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
