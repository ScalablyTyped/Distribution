package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointRequest extends StObject {
  
  /**
    * (Gateway endpoint) The IDs of the route tables to associate with the endpoint.
    */
  var AddRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList] = js.undefined
  
  /**
    * (Interface endpoint) The IDs of the security groups to associate with the network interface.
    */
  var AddSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList] = js.undefined
  
  /**
    * (Interface and Gateway Load Balancer endpoints) The IDs of the subnets in which to serve the endpoint. For a Gateway Load Balancer endpoint, you can specify only one subnet.
    */
  var AddSubnetIds: js.UndefOr[VpcEndpointSubnetIdList] = js.undefined
  
  /**
    * The DNS options for the endpoint.
    */
  var DnsOptions: js.UndefOr[DnsOptionsSpecification] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IP address type for the endpoint.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpAddressType] = js.undefined
  
  /**
    * (Interface and gateway endpoints) A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
    */
  var PolicyDocument: js.UndefOr[String] = js.undefined
  
  /**
    * (Interface endpoint) Indicates whether a private hosted zone is associated with the VPC.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Gateway endpoint) The IDs of the route tables to disassociate from the endpoint.
    */
  var RemoveRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList] = js.undefined
  
  /**
    * (Interface endpoint) The IDs of the security groups to disassociate from the network interface.
    */
  var RemoveSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList] = js.undefined
  
  /**
    * (Interface endpoint) The IDs of the subnets from which to remove the endpoint.
    */
  var RemoveSubnetIds: js.UndefOr[VpcEndpointSubnetIdList] = js.undefined
  
  /**
    * (Gateway endpoint) Specify true to reset the policy document to the default policy. The default policy allows full access to the service.
    */
  var ResetPolicy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: typings.awsSdk.clientsEc2Mod.VpcEndpointId
}
object ModifyVpcEndpointRequest {
  
  inline def apply(VpcEndpointId: VpcEndpointId): ModifyVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setAddRouteTableIds(value: VpcEndpointRouteTableIdList): Self = StObject.set(x, "AddRouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setAddRouteTableIdsUndefined: Self = StObject.set(x, "AddRouteTableIds", js.undefined)
    
    inline def setAddRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "AddRouteTableIds", js.Array(value*))
    
    inline def setAddSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = StObject.set(x, "AddSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setAddSecurityGroupIdsUndefined: Self = StObject.set(x, "AddSecurityGroupIds", js.undefined)
    
    inline def setAddSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "AddSecurityGroupIds", js.Array(value*))
    
    inline def setAddSubnetIds(value: VpcEndpointSubnetIdList): Self = StObject.set(x, "AddSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setAddSubnetIdsUndefined: Self = StObject.set(x, "AddSubnetIds", js.undefined)
    
    inline def setAddSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "AddSubnetIds", js.Array(value*))
    
    inline def setDnsOptions(value: DnsOptionsSpecification): Self = StObject.set(x, "DnsOptions", value.asInstanceOf[js.Any])
    
    inline def setDnsOptionsUndefined: Self = StObject.set(x, "DnsOptions", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setPolicyDocument(value: String): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setPrivateDnsEnabled(value: Boolean): Self = StObject.set(x, "PrivateDnsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsEnabledUndefined: Self = StObject.set(x, "PrivateDnsEnabled", js.undefined)
    
    inline def setRemoveRouteTableIds(value: VpcEndpointRouteTableIdList): Self = StObject.set(x, "RemoveRouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveRouteTableIdsUndefined: Self = StObject.set(x, "RemoveRouteTableIds", js.undefined)
    
    inline def setRemoveRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "RemoveRouteTableIds", js.Array(value*))
    
    inline def setRemoveSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = StObject.set(x, "RemoveSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveSecurityGroupIdsUndefined: Self = StObject.set(x, "RemoveSecurityGroupIds", js.undefined)
    
    inline def setRemoveSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "RemoveSecurityGroupIds", js.Array(value*))
    
    inline def setRemoveSubnetIds(value: VpcEndpointSubnetIdList): Self = StObject.set(x, "RemoveSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveSubnetIdsUndefined: Self = StObject.set(x, "RemoveSubnetIds", js.undefined)
    
    inline def setRemoveSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "RemoveSubnetIds", js.Array(value*))
    
    inline def setResetPolicy(value: Boolean): Self = StObject.set(x, "ResetPolicy", value.asInstanceOf[js.Any])
    
    inline def setResetPolicyUndefined: Self = StObject.set(x, "ResetPolicy", js.undefined)
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
  }
}
