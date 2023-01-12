package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePermissionGroupRequest extends StObject {
  
  /**
    * The permissions that are granted to a specific group for accessing the FinSpace application.  When assigning application permissions, be aware that the permission ManageUsersAndGroups allows users to grant themselves or others access to any functionality in their FinSpace environment's application. It should only be granted to trusted users.     CreateDataset – Group members can create new datasets.    ManageClusters – Group members can manage Apache Spark clusters from FinSpace notebooks.    ManageUsersAndGroups – Group members can manage users and permission groups. This is a privileged permission that allows users to grant themselves or others access to any functionality in the application. It should only be granted to trusted users.    ManageAttributeSets – Group members can manage attribute sets.    ViewAuditData – Group members can view audit data.    AccessNotebooks – Group members will have access to FinSpace notebooks.    GetTemporaryCredentials – Group members can get temporary API credentials.  
    */
  var applicationPermissions: js.UndefOr[ApplicationPermissionList] = js.undefined
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A brief description for the permission group.
    */
  var description: js.UndefOr[PermissionGroupDescription] = js.undefined
  
  /**
    * The name of the permission group.
    */
  var name: js.UndefOr[PermissionGroupName] = js.undefined
  
  /**
    * The unique identifier for the permission group to update.
    */
  var permissionGroupId: PermissionGroupId
}
object UpdatePermissionGroupRequest {
  
  inline def apply(permissionGroupId: PermissionGroupId): UpdatePermissionGroupRequest = {
    val __obj = js.Dynamic.literal(permissionGroupId = permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePermissionGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePermissionGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationPermissions(value: ApplicationPermissionList): Self = StObject.set(x, "applicationPermissions", value.asInstanceOf[js.Any])
    
    inline def setApplicationPermissionsUndefined: Self = StObject.set(x, "applicationPermissions", js.undefined)
    
    inline def setApplicationPermissionsVarargs(value: ApplicationPermission*): Self = StObject.set(x, "applicationPermissions", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: PermissionGroupDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: PermissionGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
  }
}
