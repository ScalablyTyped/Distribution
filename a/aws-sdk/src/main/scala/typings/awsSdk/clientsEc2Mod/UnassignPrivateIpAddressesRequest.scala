package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignPrivateIpAddressesRequest extends StObject {
  
  /**
    * The IPv4 prefixes to unassign from the network interface.
    */
  var Ipv4Prefixes: js.UndefOr[IpPrefixList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.clientsEc2Mod.NetworkInterfaceId
  
  /**
    * The secondary private IP addresses to unassign from the network interface. You can specify this option multiple times to unassign more than one IP address.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined
}
object UnassignPrivateIpAddressesRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): UnassignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignPrivateIpAddressesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnassignPrivateIpAddressesRequest] (val x: Self) extends AnyVal {
    
    inline def setIpv4Prefixes(value: IpPrefixList): Self = StObject.set(x, "Ipv4Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixesUndefined: Self = StObject.set(x, "Ipv4Prefixes", js.undefined)
    
    inline def setIpv4PrefixesVarargs(value: String*): Self = StObject.set(x, "Ipv4Prefixes", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddresses(value: PrivateIpAddressStringList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
  }
}
