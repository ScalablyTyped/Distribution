package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResolverEndpointIpAddressRequest extends StObject {
  
  /**
    * Either the IPv4 address that you want to add to a Resolver endpoint or a subnet ID. If you specify a subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
    */
  var IpAddress: IpAddressUpdate
  
  /**
    * The ID of the Resolver endpoint that you want to associate IP addresses with.
    */
  var ResolverEndpointId: ResourceId
}
object AssociateResolverEndpointIpAddressRequest {
  
  inline def apply(IpAddress: IpAddressUpdate, ResolverEndpointId: ResourceId): AssociateResolverEndpointIpAddressRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any], ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateResolverEndpointIpAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setIpAddress(value: IpAddressUpdate): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
