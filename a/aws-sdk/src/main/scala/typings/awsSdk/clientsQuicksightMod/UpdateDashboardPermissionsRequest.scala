package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDashboardPermissionsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId
  
  /**
    * Grants link permissions to all users in a defined namespace.
    */
  var GrantLinkPermissions: js.UndefOr[UpdateLinkPermissionList] = js.undefined
  
  /**
    * The permissions that you want to grant on this resource.
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
  
  /**
    * Revokes link permissions from all users in a defined namespace.
    */
  var RevokeLinkPermissions: js.UndefOr[UpdateLinkPermissionList] = js.undefined
  
  /**
    * The permissions that you want to revoke from this resource.
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
}
object UpdateDashboardPermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId): UpdateDashboardPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardPermissionsRequest]
  }
  
  extension [Self <: UpdateDashboardPermissionsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setGrantLinkPermissions(value: UpdateLinkPermissionList): Self = StObject.set(x, "GrantLinkPermissions", value.asInstanceOf[js.Any])
    
    inline def setGrantLinkPermissionsUndefined: Self = StObject.set(x, "GrantLinkPermissions", js.undefined)
    
    inline def setGrantLinkPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "GrantLinkPermissions", js.Array(value*))
    
    inline def setGrantPermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "GrantPermissions", value.asInstanceOf[js.Any])
    
    inline def setGrantPermissionsUndefined: Self = StObject.set(x, "GrantPermissions", js.undefined)
    
    inline def setGrantPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "GrantPermissions", js.Array(value*))
    
    inline def setRevokeLinkPermissions(value: UpdateLinkPermissionList): Self = StObject.set(x, "RevokeLinkPermissions", value.asInstanceOf[js.Any])
    
    inline def setRevokeLinkPermissionsUndefined: Self = StObject.set(x, "RevokeLinkPermissions", js.undefined)
    
    inline def setRevokeLinkPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "RevokeLinkPermissions", js.Array(value*))
    
    inline def setRevokePermissions(value: UpdateResourcePermissionList): Self = StObject.set(x, "RevokePermissions", value.asInstanceOf[js.Any])
    
    inline def setRevokePermissionsUndefined: Self = StObject.set(x, "RevokePermissions", js.undefined)
    
    inline def setRevokePermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "RevokePermissions", js.Array(value*))
  }
}
