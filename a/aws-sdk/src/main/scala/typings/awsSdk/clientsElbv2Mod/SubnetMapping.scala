package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetMapping extends StObject {
  
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internet-facing load balancer.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.clientsElbv2Mod.AllocationId] = js.undefined
  
  /**
    * [Network Load Balancers] The IPv6 address.
    */
  var IPv6Address: js.UndefOr[typings.awsSdk.clientsElbv2Mod.IPv6Address] = js.undefined
  
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typings.awsSdk.clientsElbv2Mod.PrivateIPv4Address] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsElbv2Mod.SubnetId] = js.undefined
}
object SubnetMapping {
  
  inline def apply(): SubnetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetMapping]
  }
  
  extension [Self <: SubnetMapping](x: Self) {
    
    inline def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setIPv6Address(value: IPv6Address): Self = StObject.set(x, "IPv6Address", value.asInstanceOf[js.Any])
    
    inline def setIPv6AddressUndefined: Self = StObject.set(x, "IPv6Address", js.undefined)
    
    inline def setPrivateIPv4Address(value: PrivateIPv4Address): Self = StObject.set(x, "PrivateIPv4Address", value.asInstanceOf[js.Any])
    
    inline def setPrivateIPv4AddressUndefined: Self = StObject.set(x, "PrivateIPv4Address", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
