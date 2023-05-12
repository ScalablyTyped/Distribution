package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcEndpointRequest extends StObject {
  
  /**
    * The unique identifiers of the security groups to add to the endpoint. Security groups define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
    */
  var addSecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The ID of one or more subnets to add to the endpoint.
    */
  var addSubnetIds: js.UndefOr[SubnetIds] = js.undefined
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique identifier of the interface endpoint to update.
    */
  var id: VpcEndpointId
  
  /**
    * The unique identifiers of the security groups to remove from the endpoint.
    */
  var removeSecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The unique identifiers of the subnets to remove from the endpoint.
    */
  var removeSubnetIds: js.UndefOr[SubnetIds] = js.undefined
}
object UpdateVpcEndpointRequest {
  
  inline def apply(id: VpcEndpointId): UpdateVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setAddSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "addSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setAddSecurityGroupIdsUndefined: Self = StObject.set(x, "addSecurityGroupIds", js.undefined)
    
    inline def setAddSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "addSecurityGroupIds", js.Array(value*))
    
    inline def setAddSubnetIds(value: SubnetIds): Self = StObject.set(x, "addSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setAddSubnetIdsUndefined: Self = StObject.set(x, "addSubnetIds", js.undefined)
    
    inline def setAddSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "addSubnetIds", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: VpcEndpointId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRemoveSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "removeSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveSecurityGroupIdsUndefined: Self = StObject.set(x, "removeSecurityGroupIds", js.undefined)
    
    inline def setRemoveSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "removeSecurityGroupIds", js.Array(value*))
    
    inline def setRemoveSubnetIds(value: SubnetIds): Self = StObject.set(x, "removeSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveSubnetIdsUndefined: Self = StObject.set(x, "removeSubnetIds", js.undefined)
    
    inline def setRemoveSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "removeSubnetIds", js.Array(value*))
  }
}
