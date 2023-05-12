package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpAddressRequest extends StObject {
  
  /**
    * The IPv4 address that you want to use for DNS queries.
    */
  var Ip: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Ip] = js.undefined
  
  /**
    *  The IPv6 address that you want to use for DNS queries. 
    */
  var Ipv6: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Ipv6] = js.undefined
  
  /**
    * The ID of the subnet that contains the IP address. 
    */
  var SubnetId: typings.awsSdk.clientsRoute53resolverMod.SubnetId
}
object IpAddressRequest {
  
  inline def apply(SubnetId: SubnetId): IpAddressRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    inline def setIpv6(value: Ipv6): Self = StObject.set(x, "Ipv6", value.asInstanceOf[js.Any])
    
    inline def setIpv6Undefined: Self = StObject.set(x, "Ipv6", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
