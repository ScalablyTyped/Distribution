package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignIpv6AddressesRequest extends StObject {
  
  /**
    * The number of additional IPv6 addresses to assign to the network interface. The specified number of IPv6 addresses are assigned in addition to the existing IPv6 addresses that are already assigned to the network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IPv6 addresses to be assigned to the network interface. You can't use this option if you're specifying a number of IPv6 addresses.
    */
  var Ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
  
  /**
    * The number of IPv6 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot use this option if you use the Ipv6Prefixes option.
    */
  var Ipv6PrefixCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more IPv6 prefixes assigned to the network interface. You cannot use this option if you use the Ipv6PrefixCount option.
    */
  var Ipv6Prefixes: js.UndefOr[IpPrefixList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.clientsEc2Mod.NetworkInterfaceId
}
object AssignIpv6AddressesRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): AssignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignIpv6AddressesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignIpv6AddressesRequest] (val x: Self) extends AnyVal {
    
    inline def setIpv6AddressCount(value: Integer): Self = StObject.set(x, "Ipv6AddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "Ipv6AddressCount", js.undefined)
    
    inline def setIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value*))
    
    inline def setIpv6PrefixCount(value: Integer): Self = StObject.set(x, "Ipv6PrefixCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixCountUndefined: Self = StObject.set(x, "Ipv6PrefixCount", js.undefined)
    
    inline def setIpv6Prefixes(value: IpPrefixList): Self = StObject.set(x, "Ipv6Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixesUndefined: Self = StObject.set(x, "Ipv6Prefixes", js.undefined)
    
    inline def setIpv6PrefixesVarargs(value: String*): Self = StObject.set(x, "Ipv6Prefixes", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
  }
}
