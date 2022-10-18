package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThemePermissionsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the theme.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A list of resource permissions to be granted for the theme.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
  
  /**
    * A list of resource permissions to be revoked from the theme.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId
}
object UpdateThemePermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): UpdateThemePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemePermissionsRequest]
  }
  
  extension [Self <: UpdateThemePermissionsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setGrantPermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "GrantPermissions", value.asInstanceOf[js.Any])
    
    inline def setGrantPermissionsUndefined: Self = StObject.set(x, "GrantPermissions", js.undefined)
    
    inline def setGrantPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "GrantPermissions", js.Array(value*))
    
    inline def setRevokePermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "RevokePermissions", value.asInstanceOf[js.Any])
    
    inline def setRevokePermissionsUndefined: Self = StObject.set(x, "RevokePermissions", js.undefined)
    
    inline def setRevokePermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "RevokePermissions", js.Array(value*))
    
    inline def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
  }
}
