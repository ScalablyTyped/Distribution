package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpnTunnelReplacementStatusResult extends StObject {
  
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.CustomerGatewayId] = js.undefined
  
  /**
    * Get details of pending tunnel endpoint maintenance.
    */
  var MaintenanceDetails: js.UndefOr[typings.awsSdk.clientsEc2Mod.MaintenanceDetails] = js.undefined
  
  /**
    * The ID of the transit gateway associated with the VPN connection.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayId] = js.undefined
  
  /**
    * The ID of the Site-to-Site VPN connection. 
    */
  var VpnConnectionId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnConnectionId] = js.undefined
  
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnGatewayId] = js.undefined
  
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: js.UndefOr[String] = js.undefined
}
object GetVpnTunnelReplacementStatusResult {
  
  inline def apply(): GetVpnTunnelReplacementStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpnTunnelReplacementStatusResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVpnTunnelReplacementStatusResult] (val x: Self) extends AnyVal {
    
    inline def setCustomerGatewayId(value: CustomerGatewayId): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayIdUndefined: Self = StObject.set(x, "CustomerGatewayId", js.undefined)
    
    inline def setMaintenanceDetails(value: MaintenanceDetails): Self = StObject.set(x, "MaintenanceDetails", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceDetailsUndefined: Self = StObject.set(x, "MaintenanceDetails", js.undefined)
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionIdUndefined: Self = StObject.set(x, "VpnConnectionId", js.undefined)
    
    inline def setVpnGatewayId(value: VpnGatewayId): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayIdUndefined: Self = StObject.set(x, "VpnGatewayId", js.undefined)
    
    inline def setVpnTunnelOutsideIpAddress(value: String): Self = StObject.set(x, "VpnTunnelOutsideIpAddress", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelOutsideIpAddressUndefined: Self = StObject.set(x, "VpnTunnelOutsideIpAddress", js.undefined)
  }
}
