package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnConnectionRequest extends StObject {
  
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.CustomerGatewayId] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayId] = js.undefined
  
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.clientsEc2Mod.VpnConnectionId
  
  /**
    * The ID of the virtual private gateway at the Amazon Web Services side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnGatewayId] = js.undefined
}
object ModifyVpnConnectionRequest {
  
  inline def apply(VpnConnectionId: VpnConnectionId): ModifyVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnConnectionRequest]
  }
  
  extension [Self <: ModifyVpnConnectionRequest](x: Self) {
    
    inline def setCustomerGatewayId(value: CustomerGatewayId): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayIdUndefined: Self = StObject.set(x, "CustomerGatewayId", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayId(value: VpnGatewayId): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayIdUndefined: Self = StObject.set(x, "VpnGatewayId", js.undefined)
  }
}
