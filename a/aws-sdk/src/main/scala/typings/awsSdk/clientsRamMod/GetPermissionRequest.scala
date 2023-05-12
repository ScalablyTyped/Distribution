package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the permission whose contents you want to retrieve. To find the ARN for a permission, use either the ListPermissions operation or go to the Permissions library page in the RAM console and then choose the name of the permission. The ARN is displayed on the detail page.
    */
  var permissionArn: String
  
  /**
    * Specifies the version number of the RAM permission to retrieve. If you don't specify this parameter, the operation retrieves the default version. To see the list of available versions, use ListPermissionVersions.
    */
  var permissionVersion: js.UndefOr[Integer] = js.undefined
}
object GetPermissionRequest {
  
  inline def apply(permissionArn: String): GetPermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersion(value: Integer): Self = StObject.set(x, "permissionVersion", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersionUndefined: Self = StObject.set(x, "permissionVersion", js.undefined)
  }
}
