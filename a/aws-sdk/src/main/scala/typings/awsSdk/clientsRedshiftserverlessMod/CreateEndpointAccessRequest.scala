package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointAccessRequest extends StObject {
  
  /**
    * The name of the VPC endpoint. An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The first character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
    */
  var endpointName: String
  
  /**
    * The unique identifers of subnets from which Amazon Redshift Serverless chooses one to deploy a VPC endpoint.
    */
  var subnetIds: SubnetIdList
  
  /**
    * The unique identifiers of the security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
    */
  var vpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  
  /**
    * The name of the workgroup to associate with the VPC endpoint.
    */
  var workgroupName: String
}
object CreateEndpointAccessRequest {
  
  inline def apply(endpointName: String, subnetIds: SubnetIdList, workgroupName: String): CreateEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(endpointName = endpointName.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointAccessRequest]
  }
  
  extension [Self <: CreateEndpointAccessRequest](x: Self) {
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "endpointName", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: VpcSecurityGroupId*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value*))
    
    inline def setWorkgroupName(value: String): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
