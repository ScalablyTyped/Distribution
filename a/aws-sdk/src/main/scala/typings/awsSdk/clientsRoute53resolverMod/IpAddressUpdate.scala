package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpAddressUpdate extends StObject {
  
  /**
    * The new IPv4 address.
    */
  var Ip: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Ip] = js.undefined
  
  /**
    *  Only when removing an IP address from a Resolver endpoint: The ID of the IP address that you want to remove. To get this ID, use GetResolverEndpoint.
    */
  var IpId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    *  The new IPv6 address. 
    */
  var Ipv6: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Ipv6] = js.undefined
  
  /**
    * The ID of the subnet that includes the IP address that you want to update. To get this ID, use GetResolverEndpoint.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.SubnetId] = js.undefined
}
object IpAddressUpdate {
  
  inline def apply(): IpAddressUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpAddressUpdate] (val x: Self) extends AnyVal {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setIpId(value: ResourceId): Self = StObject.set(x, "IpId", value.asInstanceOf[js.Any])
    
    inline def setIpIdUndefined: Self = StObject.set(x, "IpId", js.undefined)
    
    inline def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    inline def setIpv6(value: Ipv6): Self = StObject.set(x, "Ipv6", value.asInstanceOf[js.Any])
    
    inline def setIpv6Undefined: Self = StObject.set(x, "Ipv6", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
