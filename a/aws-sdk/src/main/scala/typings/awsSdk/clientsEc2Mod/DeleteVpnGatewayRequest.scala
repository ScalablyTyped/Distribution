package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpnGatewayRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: typings.awsSdk.clientsEc2Mod.VpnGatewayId
}
object DeleteVpnGatewayRequest {
  
  inline def apply(VpnGatewayId: VpnGatewayId): DeleteVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(VpnGatewayId = VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpnGatewayRequest]
  }
  
  extension [Self <: DeleteVpnGatewayRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVpnGatewayId(value: VpnGatewayId): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
  }
}
