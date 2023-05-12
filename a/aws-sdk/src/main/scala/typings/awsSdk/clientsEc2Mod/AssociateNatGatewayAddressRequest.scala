package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateNatGatewayAddressRequest extends StObject {
  
  /**
    * The allocation IDs of EIPs that you want to associate with your NAT gateway.
    */
  var AllocationIds: AllocationIdList
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The NAT gateway ID.
    */
  var NatGatewayId: typings.awsSdk.clientsEc2Mod.NatGatewayId
  
  /**
    * The private IPv4 addresses that you want to assign to the NAT gateway.
    */
  var PrivateIpAddresses: js.UndefOr[IpList] = js.undefined
}
object AssociateNatGatewayAddressRequest {
  
  inline def apply(AllocationIds: AllocationIdList, NatGatewayId: NatGatewayId): AssociateNatGatewayAddressRequest = {
    val __obj = js.Dynamic.literal(AllocationIds = AllocationIds.asInstanceOf[js.Any], NatGatewayId = NatGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateNatGatewayAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateNatGatewayAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setAllocationIds(value: AllocationIdList): Self = StObject.set(x, "AllocationIds", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdsVarargs(value: AllocationId*): Self = StObject.set(x, "AllocationIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNatGatewayId(value: NatGatewayId): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddresses(value: IpList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
  }
}
