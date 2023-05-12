package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointDetail extends StObject {
  
  /**
    * The date the endpoint was created.
    */
  var createdDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The unique identifier of the endpoint.
    */
  var id: js.UndefOr[VpcEndpointId] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var name: js.UndefOr[VpcEndpointName] = js.undefined
  
  /**
    * The unique identifiers of the security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The current status of the endpoint.
    */
  var status: js.UndefOr[VpcEndpointStatus] = js.undefined
  
  /**
    * The ID of the subnets from which you access OpenSearch Serverless.
    */
  var subnetIds: js.UndefOr[SubnetIds] = js.undefined
  
  /**
    * The ID of the VPC from which you access OpenSearch Serverless.
    */
  var vpcId: js.UndefOr[VpcId] = js.undefined
}
object VpcEndpointDetail {
  
  inline def apply(): VpcEndpointDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpointDetail] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: Long): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setId(value: VpcEndpointId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: VpcEndpointName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setStatus(value: VpcEndpointStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
