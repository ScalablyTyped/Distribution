package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcEndpointDetail extends StObject {
  
  /**
    * The unique identifier of the endpoint.
    */
  var id: js.UndefOr[VpcEndpointId] = js.undefined
  
  /**
    * The timestamp of when the endpoint was last modified.
    */
  var lastModifiedDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var name: js.UndefOr[VpcEndpointName] = js.undefined
  
  /**
    * The unique identifiers of the security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The current status of the endpoint update process.
    */
  var status: js.UndefOr[VpcEndpointStatus] = js.undefined
  
  /**
    * The ID of the subnets from which you access OpenSearch Serverless.
    */
  var subnetIds: js.UndefOr[SubnetIds] = js.undefined
}
object UpdateVpcEndpointDetail {
  
  inline def apply(): UpdateVpcEndpointDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVpcEndpointDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVpcEndpointDetail] (val x: Self) extends AnyVal {
    
    inline def setId(value: VpcEndpointId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastModifiedDate(value: Long): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
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
  }
}
