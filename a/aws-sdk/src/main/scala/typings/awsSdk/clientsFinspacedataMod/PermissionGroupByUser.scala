package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionGroupByUser extends StObject {
  
  /**
    * Indicates the status of the user account within a permission group.    ADDITION_IN_PROGRESS – The user account is currently being added to the permission group.    ADDITION_SUCCESS – The user account is successfully added to the permission group.    REMOVAL_IN_PROGRESS – The user is currently being removed from the permission group.  
    */
  var membershipStatus: js.UndefOr[PermissionGroupMembershipStatus] = js.undefined
  
  /**
    * The name of the permission group.
    */
  var name: js.UndefOr[PermissionGroupName] = js.undefined
  
  /**
    * The unique identifier for the permission group.
    */
  var permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
}
object PermissionGroupByUser {
  
  inline def apply(): PermissionGroupByUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGroupByUser]
  }
  
  extension [Self <: PermissionGroupByUser](x: Self) {
    
    inline def setMembershipStatus(value: PermissionGroupMembershipStatus): Self = StObject.set(x, "membershipStatus", value.asInstanceOf[js.Any])
    
    inline def setMembershipStatusUndefined: Self = StObject.set(x, "membershipStatus", js.undefined)
    
    inline def setName(value: PermissionGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
