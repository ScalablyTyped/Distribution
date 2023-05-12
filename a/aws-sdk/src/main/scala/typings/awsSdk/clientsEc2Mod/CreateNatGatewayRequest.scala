package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNatGatewayRequest extends StObject {
  
  /**
    * [Public NAT gateways only] The allocation ID of an Elastic IP address to associate with the NAT gateway. You cannot specify an Elastic IP address with a private NAT gateway. If the Elastic IP address is associated with another resource, you must first disassociate it.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.AllocationId] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency. Constraint: Maximum 64 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the NAT gateway supports public or private connectivity. The default is public connectivity.
    */
  var ConnectivityType: js.UndefOr[typings.awsSdk.clientsEc2Mod.ConnectivityType] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The private IPv4 address to assign to the NAT gateway. If you don't provide an address, a private IPv4 address will be automatically assigned.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Secondary EIP allocation IDs. For more information about secondary addresses, see Create a NAT gateway in the Amazon Virtual Private Cloud User Guide.
    */
  var SecondaryAllocationIds: js.UndefOr[AllocationIdList] = js.undefined
  
  /**
    * [Private NAT gateway only] The number of secondary private IPv4 addresses you want to assign to the NAT gateway. For more information about secondary addresses, see Create a NAT gateway in the Amazon Virtual Private Cloud User Guide.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[PrivateIpAddressCount] = js.undefined
  
  /**
    * Secondary private IPv4 addresses. For more information about secondary addresses, see Create a NAT gateway in the Amazon Virtual Private Cloud User Guide.
    */
  var SecondaryPrivateIpAddresses: js.UndefOr[IpList] = js.undefined
  
  /**
    * The ID of the subnet in which to create the NAT gateway.
    */
  var SubnetId: typings.awsSdk.clientsEc2Mod.SubnetId
  
  /**
    * The tags to assign to the NAT gateway.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateNatGatewayRequest {
  
  inline def apply(SubnetId: SubnetId): CreateNatGatewayRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNatGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNatGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConnectivityType(value: ConnectivityType): Self = StObject.set(x, "ConnectivityType", value.asInstanceOf[js.Any])
    
    inline def setConnectivityTypeUndefined: Self = StObject.set(x, "ConnectivityType", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setSecondaryAllocationIds(value: AllocationIdList): Self = StObject.set(x, "SecondaryAllocationIds", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAllocationIdsUndefined: Self = StObject.set(x, "SecondaryAllocationIds", js.undefined)
    
    inline def setSecondaryAllocationIdsVarargs(value: AllocationId*): Self = StObject.set(x, "SecondaryAllocationIds", js.Array(value*))
    
    inline def setSecondaryPrivateIpAddressCount(value: PrivateIpAddressCount): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
    
    inline def setSecondaryPrivateIpAddresses(value: IpList): Self = StObject.set(x, "SecondaryPrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPrivateIpAddressesUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddresses", js.undefined)
    
    inline def setSecondaryPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "SecondaryPrivateIpAddresses", js.Array(value*))
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
