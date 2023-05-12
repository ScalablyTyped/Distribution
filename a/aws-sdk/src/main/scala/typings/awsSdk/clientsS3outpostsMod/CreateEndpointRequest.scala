package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointRequest extends StObject {
  
  /**
    * The type of access for the network connectivity for the Amazon S3 on Outposts endpoint. To use the Amazon Web Services VPC, choose Private. To use the endpoint with an on-premises network, choose CustomerOwnedIp. If you choose CustomerOwnedIp, you must also provide the customer-owned IP address pool (CoIP pool).   Private is the default access type value. 
    */
  var AccessType: js.UndefOr[EndpointAccessType] = js.undefined
  
  /**
    * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint. IP addresses are allocated from this pool for the endpoint.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.CustomerOwnedIpv4Pool] = js.undefined
  
  /**
    * The ID of the Outposts. 
    */
  var OutpostId: typings.awsSdk.clientsS3outpostsMod.OutpostId
  
  /**
    * The ID of the security group to use with the endpoint.
    */
  var SecurityGroupId: typings.awsSdk.clientsS3outpostsMod.SecurityGroupId
  
  /**
    * The ID of the subnet in the selected VPC. The endpoint subnet must belong to the Outpost that has Amazon S3 on Outposts provisioned.
    */
  var SubnetId: typings.awsSdk.clientsS3outpostsMod.SubnetId
}
object CreateEndpointRequest {
  
  inline def apply(OutpostId: OutpostId, SecurityGroupId: SecurityGroupId, SubnetId: SubnetId): CreateEndpointRequest = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any], SecurityGroupId = SecurityGroupId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessType(value: EndpointAccessType): Self = StObject.set(x, "AccessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "AccessType", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: CustomerOwnedIpv4Pool): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
