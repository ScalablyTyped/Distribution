package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInfo extends StObject {
  
  /**
    * The date and time the resource was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[ResourceArnString] = js.undefined
  
  /**
    * The IAM role that registered a resource.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * Whether or not the resource is a federated resource.
    */
  var WithFederation: js.UndefOr[NullableBoolean] = js.undefined
}
object ResourceInfo {
  
  inline def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceInfo] (val x: Self) extends AnyVal {
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setWithFederation(value: NullableBoolean): Self = StObject.set(x, "WithFederation", value.asInstanceOf[js.Any])
    
    inline def setWithFederationUndefined: Self = StObject.set(x, "WithFederation", js.undefined)
  }
}
