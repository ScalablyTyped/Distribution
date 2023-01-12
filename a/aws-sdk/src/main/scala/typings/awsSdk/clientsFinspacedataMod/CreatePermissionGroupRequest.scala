package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePermissionGroupRequest extends StObject {
  
  /**
    * The option to indicate FinSpace application permissions that are granted to a specific group.  When assigning application permissions, be aware that the permission ManageUsersAndGroups allows users to grant themselves or others access to any functionality in their FinSpace environment's application. It should only be granted to trusted users.     CreateDataset – Group members can create new datasets.    ManageClusters – Group members can manage Apache Spark clusters from FinSpace notebooks.    ManageUsersAndGroups – Group members can manage users and permission groups. This is a privileged permission that allows users to grant themselves or others access to any functionality in the application. It should only be granted to trusted users.    ManageAttributeSets – Group members can manage attribute sets.    ViewAuditData – Group members can view audit data.    AccessNotebooks – Group members will have access to FinSpace notebooks.    GetTemporaryCredentials – Group members can get temporary API credentials.  
    */
  var applicationPermissions: ApplicationPermissionList
  
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
  var name: PermissionGroupName
}
object CreatePermissionGroupRequest {
  
  inline def apply(applicationPermissions: ApplicationPermissionList, name: PermissionGroupName): CreatePermissionGroupRequest = {
    val __obj = js.Dynamic.literal(applicationPermissions = applicationPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePermissionGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePermissionGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationPermissions(value: ApplicationPermissionList): Self = StObject.set(x, "applicationPermissions", value.asInstanceOf[js.Any])
    
    inline def setApplicationPermissionsVarargs(value: ApplicationPermission*): Self = StObject.set(x, "applicationPermissions", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: PermissionGroupDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: PermissionGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
