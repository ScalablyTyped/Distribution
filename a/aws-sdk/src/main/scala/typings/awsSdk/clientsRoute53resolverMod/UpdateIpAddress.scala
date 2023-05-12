package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIpAddress extends StObject {
  
  /**
    *  The ID of the IP address, specified by the ResolverEndpointId. 
    */
  var IpId: ResourceId
  
  /**
    *  The IPv6 address that you want to use for DNS queries. 
    */
  var Ipv6: typings.awsSdk.clientsRoute53resolverMod.Ipv6
}
object UpdateIpAddress {
  
  inline def apply(IpId: ResourceId, Ipv6: Ipv6): UpdateIpAddress = {
    val __obj = js.Dynamic.literal(IpId = IpId.asInstanceOf[js.Any], Ipv6 = Ipv6.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIpAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateIpAddress] (val x: Self) extends AnyVal {
    
    inline def setIpId(value: ResourceId): Self = StObject.set(x, "IpId", value.asInstanceOf[js.Any])
    
    inline def setIpv6(value: Ipv6): Self = StObject.set(x, "Ipv6", value.asInstanceOf[js.Any])
  }
}
