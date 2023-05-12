package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * The type of connectivity used to access the Amazon S3 on Outposts endpoint.
    */
  var AccessType: js.UndefOr[EndpointAccessType] = js.undefined
  
  /**
    * The VPC CIDR committed by this endpoint.
    */
  var CidrBlock: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.CidrBlock] = js.undefined
  
  /**
    * The time the endpoint was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the customer-owned IPv4 address pool used for the endpoint.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.CustomerOwnedIpv4Pool] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.EndpointArn] = js.undefined
  
  /**
    * The failure reason, if any, for a create or delete endpoint operation.
    */
  var FailedReason: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.FailedReason] = js.undefined
  
  /**
    * The network interface of the endpoint.
    */
  var NetworkInterfaces: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NetworkInterfaces] = js.undefined
  
  /**
    * The ID of the Outposts.
    */
  var OutpostsId: js.UndefOr[OutpostId] = js.undefined
  
  /**
    * The ID of the security group used for the endpoint.
    */
  var SecurityGroupId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.SecurityGroupId] = js.undefined
  
  /**
    * The status of the endpoint.
    */
  var Status: js.UndefOr[EndpointStatus] = js.undefined
  
  /**
    * The ID of the subnet used for the endpoint.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.SubnetId] = js.undefined
  
  /**
    * The ID of the VPC used for the endpoint.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.VpcId] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    inline def setAccessType(value: EndpointAccessType): Self = StObject.set(x, "AccessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "AccessType", js.undefined)
    
    inline def setCidrBlock(value: CidrBlock): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: CustomerOwnedIpv4Pool): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    inline def setFailedReason(value: FailedReason): Self = StObject.set(x, "FailedReason", value.asInstanceOf[js.Any])
    
    inline def setFailedReasonUndefined: Self = StObject.set(x, "FailedReason", js.undefined)
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setOutpostsId(value: OutpostId): Self = StObject.set(x, "OutpostsId", value.asInstanceOf[js.Any])
    
    inline def setOutpostsIdUndefined: Self = StObject.set(x, "OutpostsId", js.undefined)
    
    inline def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
    
    inline def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
