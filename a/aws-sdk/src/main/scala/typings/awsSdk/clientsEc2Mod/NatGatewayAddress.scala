package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NatGatewayAddress extends StObject {
  
  /**
    * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with the NAT gateway.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the network interface associated with the NAT gateway.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The private IP address associated with the NAT gateway.
    */
  var PrivateIp: js.UndefOr[String] = js.undefined
  
  /**
    * [Public NAT gateway only] The Elastic IP address associated with the NAT gateway.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}
object NatGatewayAddress {
  
  inline def apply(): NatGatewayAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NatGatewayAddress]
  }
  
  extension [Self <: NatGatewayAddress](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setPrivateIp(value: String): Self = StObject.set(x, "PrivateIp", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpUndefined: Self = StObject.set(x, "PrivateIp", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
