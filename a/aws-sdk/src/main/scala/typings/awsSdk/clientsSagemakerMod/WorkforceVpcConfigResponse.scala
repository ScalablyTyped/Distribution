package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkforceVpcConfigResponse extends StObject {
  
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in the subnet.
    */
  var SecurityGroupIds: WorkforceSecurityGroupIds
  
  /**
    * The ID of the subnets in the VPC that you want to connect.
    */
  var Subnets: WorkforceSubnets
  
  /**
    * The IDs for the VPC service endpoints of your VPC workforce when it is created and updated.
    */
  var VpcEndpointId: js.UndefOr[WorkforceVpcEndpointId] = js.undefined
  
  /**
    * The ID of the VPC that the workforce uses for communication.
    */
  var VpcId: WorkforceVpcId
}
object WorkforceVpcConfigResponse {
  
  inline def apply(SecurityGroupIds: WorkforceSecurityGroupIds, Subnets: WorkforceSubnets, VpcId: WorkforceVpcId): WorkforceVpcConfigResponse = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkforceVpcConfigResponse]
  }
  
  extension [Self <: WorkforceVpcConfigResponse](x: Self) {
    
    inline def setSecurityGroupIds(value: WorkforceSecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: WorkforceSecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnets(value: WorkforceSubnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: WorkforceSubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setVpcEndpointId(value: WorkforceVpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcId(value: WorkforceVpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
