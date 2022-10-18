package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeClientVpnIngressRequest extends StObject {
  
  /**
    * The ID of the Active Directory group for which to revoke access. 
    */
  var AccessGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: typings.awsSdk.clientsEc2Mod.ClientVpnEndpointId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether access should be revoked for all clients.
    */
  var RevokeAllGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
    */
  var TargetNetworkCidr: String
}
object RevokeClientVpnIngressRequest {
  
  inline def apply(ClientVpnEndpointId: ClientVpnEndpointId, TargetNetworkCidr: String): RevokeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClientVpnIngressRequest]
  }
  
  extension [Self <: RevokeClientVpnIngressRequest](x: Self) {
    
    inline def setAccessGroupId(value: String): Self = StObject.set(x, "AccessGroupId", value.asInstanceOf[js.Any])
    
    inline def setAccessGroupIdUndefined: Self = StObject.set(x, "AccessGroupId", js.undefined)
    
    inline def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setRevokeAllGroups(value: Boolean): Self = StObject.set(x, "RevokeAllGroups", value.asInstanceOf[js.Any])
    
    inline def setRevokeAllGroupsUndefined: Self = StObject.set(x, "RevokeAllGroups", js.undefined)
    
    inline def setTargetNetworkCidr(value: String): Self = StObject.set(x, "TargetNetworkCidr", value.asInstanceOf[js.Any])
  }
}
