package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceVpnTunnelRequest extends StObject {
  
  /**
    * Trigger pending tunnel endpoint maintenance.
    */
  var ApplyPendingMaintenance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Site-to-Site VPN connection. 
    */
  var VpnConnectionId: typings.awsSdk.clientsEc2Mod.VpnConnectionId
  
  /**
    * The external IP address of the VPN tunnel.
    */
  var VpnTunnelOutsideIpAddress: String
}
object ReplaceVpnTunnelRequest {
  
  inline def apply(VpnConnectionId: VpnConnectionId, VpnTunnelOutsideIpAddress: String): ReplaceVpnTunnelRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any], VpnTunnelOutsideIpAddress = VpnTunnelOutsideIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceVpnTunnelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceVpnTunnelRequest] (val x: Self) extends AnyVal {
    
    inline def setApplyPendingMaintenance(value: Boolean): Self = StObject.set(x, "ApplyPendingMaintenance", value.asInstanceOf[js.Any])
    
    inline def setApplyPendingMaintenanceUndefined: Self = StObject.set(x, "ApplyPendingMaintenance", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelOutsideIpAddress(value: String): Self = StObject.set(x, "VpnTunnelOutsideIpAddress", value.asInstanceOf[js.Any])
  }
}
