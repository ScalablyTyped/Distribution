package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnRoute extends StObject {
  
  /**
    * The ID of the Client VPN endpoint with which the route is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * A brief description of the route.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 address range, in CIDR notation, of the route destination.
    */
  var DestinationCidr: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates how the route was associated with the Client VPN endpoint. associate indicates that the route was automatically added when the target network was associated with the Client VPN endpoint. add-route indicates that the route was manually added using the CreateClientVpnRoute action.
    */
  var Origin: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.undefined
  
  /**
    * The ID of the subnet through which traffic is routed.
    */
  var TargetSubnet: js.UndefOr[String] = js.undefined
  
  /**
    * The route type.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object ClientVpnRoute {
  
  inline def apply(): ClientVpnRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientVpnRoute] (val x: Self) extends AnyVal {
    
    inline def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationCidr(value: String): Self = StObject.set(x, "DestinationCidr", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrUndefined: Self = StObject.set(x, "DestinationCidr", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    inline def setStatus(value: ClientVpnRouteStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetSubnet(value: String): Self = StObject.set(x, "TargetSubnet", value.asInstanceOf[js.Any])
    
    inline def setTargetSubnetUndefined: Self = StObject.set(x, "TargetSubnet", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
