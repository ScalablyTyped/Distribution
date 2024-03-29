package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceSharePermissionRequest extends StObject {
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you. If you retry the operation with the same ClientToken, but with different parameters, the retry fails with an IdempotentParameterMismatch error.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the RAM permission to associate with the resource share. To find the ARN for a permission, use either the ListPermissions operation or go to the Permissions library page in the RAM console and then choose the name of the permission. The ARN is displayed on the detail page.
    */
  var permissionArn: String
  
  /**
    * Specifies the version of the RAM permission to associate with the resource share. You can specify only the version that is currently set as the default version for the permission. If you also set the replace pararameter to true, then this operation updates an outdated version of the permission to the current default version.  You don't need to specify this parameter because the default behavior is to use the version that is currently set as the default version for the permission. This parameter is supported for backwards compatibility. 
    */
  var permissionVersion: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies whether the specified permission should replace the existing permission associated with the resource share. Use true to replace the current permissions. Use false to add the permission to a resource share that currently doesn't have a permission. The default value is false.  A resource share can have only one permission per resource type. If a resource share already has a permission for the specified resource type and you don't set replace to true then the operation returns an error. This helps prevent accidental overwriting of a permission. 
    */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the resource share to which you want to add or replace permissions.
    */
  var resourceShareArn: String
}
object AssociateResourceSharePermissionRequest {
  
  inline def apply(permissionArn: String, resourceShareArn: String): AssociateResourceSharePermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceSharePermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateResourceSharePermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersion(value: Integer): Self = StObject.set(x, "permissionVersion", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersionUndefined: Self = StObject.set(x, "permissionVersion", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
