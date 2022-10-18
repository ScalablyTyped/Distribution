package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkSitePlanRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network site.
    */
  var networkSiteArn: Arn
  
  /**
    * The pending plan.
    */
  var pendingPlan: SitePlan
}
object UpdateNetworkSitePlanRequest {
  
  inline def apply(networkSiteArn: Arn, pendingPlan: SitePlan): UpdateNetworkSitePlanRequest = {
    val __obj = js.Dynamic.literal(networkSiteArn = networkSiteArn.asInstanceOf[js.Any], pendingPlan = pendingPlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkSitePlanRequest]
  }
  
  extension [Self <: UpdateNetworkSitePlanRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setNetworkSiteArn(value: Arn): Self = StObject.set(x, "networkSiteArn", value.asInstanceOf[js.Any])
    
    inline def setPendingPlan(value: SitePlan): Self = StObject.set(x, "pendingPlan", value.asInstanceOf[js.Any])
  }
}
