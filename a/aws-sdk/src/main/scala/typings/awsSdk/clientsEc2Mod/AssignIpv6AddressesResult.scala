package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignIpv6AddressesResult extends StObject {
  
  /**
    * The new IPv6 addresses assigned to the network interface. Existing IPv6 addresses that were assigned to the network interface before the request are not included.
    */
  var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
  
  /**
    * The IPv6 prefixes that are assigned to the network interface.
    */
  var AssignedIpv6Prefixes: js.UndefOr[IpPrefixList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
}
object AssignIpv6AddressesResult {
  
  inline def apply(): AssignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignIpv6AddressesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignIpv6AddressesResult] (val x: Self) extends AnyVal {
    
    inline def setAssignedIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "AssignedIpv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setAssignedIpv6AddressesUndefined: Self = StObject.set(x, "AssignedIpv6Addresses", js.undefined)
    
    inline def setAssignedIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "AssignedIpv6Addresses", js.Array(value*))
    
    inline def setAssignedIpv6Prefixes(value: IpPrefixList): Self = StObject.set(x, "AssignedIpv6Prefixes", value.asInstanceOf[js.Any])
    
    inline def setAssignedIpv6PrefixesUndefined: Self = StObject.set(x, "AssignedIpv6Prefixes", js.undefined)
    
    inline def setAssignedIpv6PrefixesVarargs(value: String*): Self = StObject.set(x, "AssignedIpv6Prefixes", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
