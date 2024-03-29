package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceRequest extends StObject {
  
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString
  
  /**
    * The new role to use for the given resource registered in Lake Formation.
    */
  var RoleArn: IAMRoleArn
  
  /**
    * Whether or not the resource is a federated resource.
    */
  var WithFederation: js.UndefOr[NullableBoolean] = js.undefined
}
object UpdateResourceRequest {
  
  inline def apply(ResourceArn: ResourceArnString, RoleArn: IAMRoleArn): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setWithFederation(value: NullableBoolean): Self = StObject.set(x, "WithFederation", value.asInstanceOf[js.Any])
    
    inline def setWithFederationUndefined: Self = StObject.set(x, "WithFederation", js.undefined)
  }
}
