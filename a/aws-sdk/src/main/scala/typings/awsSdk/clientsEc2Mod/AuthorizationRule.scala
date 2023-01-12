package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationRule extends StObject {
  
  /**
    * Indicates whether the authorization rule grants access to all clients.
    */
  var AccessAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * A brief description of the authorization rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
    */
  var DestinationCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Active Directory group to which the authorization rule grants access.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.undefined
}
object AuthorizationRule {
  
  inline def apply(): AuthorizationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationRule] (val x: Self) extends AnyVal {
    
    inline def setAccessAll(value: Boolean): Self = StObject.set(x, "AccessAll", value.asInstanceOf[js.Any])
    
    inline def setAccessAllUndefined: Self = StObject.set(x, "AccessAll", js.undefined)
    
    inline def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationCidr(value: String): Self = StObject.set(x, "DestinationCidr", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrUndefined: Self = StObject.set(x, "DestinationCidr", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setStatus(value: ClientVpnAuthorizationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
