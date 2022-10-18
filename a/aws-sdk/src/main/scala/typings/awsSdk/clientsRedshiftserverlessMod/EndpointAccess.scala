package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAccess extends StObject {
  
  /**
    * The DNS address of the endpoint.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint.
    */
  var endpointArn: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the endpoint was created.
    */
  var endpointCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the VPC endpoint.
    */
  var endpointName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the VPC endpoint.
    */
  var endpointStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which Amazon Redshift Serverless accepts incoming connections.
    */
  var port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The unique identifier of subnets where Amazon Redshift Serverless choose to deploy the VPC endpoint.
    */
  var subnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * The connection endpoint for connecting to Amazon Redshift Serverless.
    */
  var vpcEndpoint: js.UndefOr[VpcEndpoint] = js.undefined
  
  /**
    * The security groups associated with the endpoint.
    */
  var vpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
  
  /**
    * The name of the workgroup associated with the endpoint.
    */
  var workgroupName: js.UndefOr[String] = js.undefined
}
object EndpointAccess {
  
  inline def apply(): EndpointAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointAccess]
  }
  
  extension [Self <: EndpointAccess](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "endpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "endpointArn", js.undefined)
    
    inline def setEndpointCreateTime(value: js.Date): Self = StObject.set(x, "endpointCreateTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointCreateTimeUndefined: Self = StObject.set(x, "endpointCreateTime", js.undefined)
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "endpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "endpointName", js.undefined)
    
    inline def setEndpointStatus(value: String): Self = StObject.set(x, "endpointStatus", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatusUndefined: Self = StObject.set(x, "endpointStatus", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "vpcEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointUndefined: Self = StObject.set(x, "vpcEndpoint", js.undefined)
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "vpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "vpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "vpcSecurityGroups", js.Array(value*))
    
    inline def setWorkgroupName(value: String): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "workgroupName", js.undefined)
  }
}
