package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableVgwRoutePropagationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: VpnGatewayId
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.clientsEc2Mod.RouteTableId
}
object DisableVgwRoutePropagationRequest {
  
  inline def apply(GatewayId: VpnGatewayId, RouteTableId: RouteTableId): DisableVgwRoutePropagationRequest = {
    val __obj = js.Dynamic.literal(GatewayId = GatewayId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableVgwRoutePropagationRequest]
  }
  
  extension [Self <: DisableVgwRoutePropagationRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGatewayId(value: VpnGatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setRouteTableId(value: RouteTableId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
  }
}
