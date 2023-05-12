package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignPrivateNatGatewayAddressRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The NAT gateway ID.
    */
  var NatGatewayId: typings.awsSdk.clientsEc2Mod.NatGatewayId
  
  /**
    * The number of private IP addresses to assign to the NAT gateway. You can't specify this parameter when also specifying private IP addresses.
    */
  var PrivateIpAddressCount: js.UndefOr[typings.awsSdk.clientsEc2Mod.PrivateIpAddressCount] = js.undefined
  
  /**
    * The private IPv4 addresses you want to assign to the private NAT gateway.
    */
  var PrivateIpAddresses: js.UndefOr[IpList] = js.undefined
}
object AssignPrivateNatGatewayAddressRequest {
  
  inline def apply(NatGatewayId: NatGatewayId): AssignPrivateNatGatewayAddressRequest = {
    val __obj = js.Dynamic.literal(NatGatewayId = NatGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignPrivateNatGatewayAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignPrivateNatGatewayAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNatGatewayId(value: NatGatewayId): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressCount(value: PrivateIpAddressCount): Self = StObject.set(x, "PrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressCountUndefined: Self = StObject.set(x, "PrivateIpAddressCount", js.undefined)
    
    inline def setPrivateIpAddresses(value: IpList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
  }
}
