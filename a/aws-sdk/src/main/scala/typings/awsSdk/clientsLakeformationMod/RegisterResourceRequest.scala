package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to register.
    */
  var ResourceArn: ResourceArnString
  
  /**
    * The identifier for the role that registers the resource.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * Designates an Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake Formation. For more information, see Using Service-Linked Roles for Lake Formation.
    */
  var UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Whether or not the resource is a federated resource.
    */
  var WithFederation: js.UndefOr[NullableBoolean] = js.undefined
}
object RegisterResourceRequest {
  
  inline def apply(ResourceArn: ResourceArnString): RegisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUseServiceLinkedRole(value: NullableBoolean): Self = StObject.set(x, "UseServiceLinkedRole", value.asInstanceOf[js.Any])
    
    inline def setUseServiceLinkedRoleUndefined: Self = StObject.set(x, "UseServiceLinkedRole", js.undefined)
    
    inline def setWithFederation(value: NullableBoolean): Self = StObject.set(x, "WithFederation", value.asInstanceOf[js.Any])
    
    inline def setWithFederationUndefined: Self = StObject.set(x, "WithFederation", js.undefined)
  }
}
