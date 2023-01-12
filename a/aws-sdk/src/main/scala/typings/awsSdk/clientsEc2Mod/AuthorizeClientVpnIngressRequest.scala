package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeClientVpnIngressRequest extends StObject {
  
  /**
    * The ID of the group to grant access to, for example, the Active Directory group or identity provider (IdP) group. Required if AuthorizeAllGroups is false or not specified.
    */
  var AccessGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to grant access to all clients. Specify true to grant all clients who successfully establish a VPN connection access to the network. Must be set to true if AccessGroupId is not specified.
    */
  var AuthorizeAllGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typings.awsSdk.clientsEc2Mod.ClientVpnEndpointId
  
  /**
    * A brief description of the authorization rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
    */
  var TargetNetworkCidr: String
}
object AuthorizeClientVpnIngressRequest {
  
  inline def apply(ClientVpnEndpointId: ClientVpnEndpointId, TargetNetworkCidr: String): AuthorizeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClientVpnIngressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeClientVpnIngressRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessGroupId(value: String): Self = StObject.set(x, "AccessGroupId", value.asInstanceOf[js.Any])
    
    inline def setAccessGroupIdUndefined: Self = StObject.set(x, "AccessGroupId", js.undefined)
    
    inline def setAuthorizeAllGroups(value: Boolean): Self = StObject.set(x, "AuthorizeAllGroups", value.asInstanceOf[js.Any])
    
    inline def setAuthorizeAllGroupsUndefined: Self = StObject.set(x, "AuthorizeAllGroups", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTargetNetworkCidr(value: String): Self = StObject.set(x, "TargetNetworkCidr", value.asInstanceOf[js.Any])
  }
}
