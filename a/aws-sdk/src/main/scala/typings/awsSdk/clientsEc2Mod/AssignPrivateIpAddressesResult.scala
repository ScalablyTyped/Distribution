package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignPrivateIpAddressesResult extends StObject {
  
  /**
    * The IPv4 prefixes that are assigned to the network interface.
    */
  var AssignedIpv4Prefixes: js.UndefOr[Ipv4PrefixesList] = js.undefined
  
  /**
    * The private IP addresses assigned to the network interface.
    */
  var AssignedPrivateIpAddresses: js.UndefOr[AssignedPrivateIpAddressList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
}
object AssignPrivateIpAddressesResult {
  
  inline def apply(): AssignPrivateIpAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignPrivateIpAddressesResult]
  }
  
  extension [Self <: AssignPrivateIpAddressesResult](x: Self) {
    
    inline def setAssignedIpv4Prefixes(value: Ipv4PrefixesList): Self = StObject.set(x, "AssignedIpv4Prefixes", value.asInstanceOf[js.Any])
    
    inline def setAssignedIpv4PrefixesUndefined: Self = StObject.set(x, "AssignedIpv4Prefixes", js.undefined)
    
    inline def setAssignedIpv4PrefixesVarargs(value: Ipv4PrefixSpecification*): Self = StObject.set(x, "AssignedIpv4Prefixes", js.Array(value*))
    
    inline def setAssignedPrivateIpAddresses(value: AssignedPrivateIpAddressList): Self = StObject.set(x, "AssignedPrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setAssignedPrivateIpAddressesUndefined: Self = StObject.set(x, "AssignedPrivateIpAddresses", js.undefined)
    
    inline def setAssignedPrivateIpAddressesVarargs(value: AssignedPrivateIpAddress*): Self = StObject.set(x, "AssignedPrivateIpAddresses", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
