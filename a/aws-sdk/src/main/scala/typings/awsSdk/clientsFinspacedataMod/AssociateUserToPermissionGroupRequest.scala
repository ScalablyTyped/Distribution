package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateUserToPermissionGroupRequest extends StObject {
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique identifier for the permission group.
    */
  var permissionGroupId: PermissionGroupId
  
  /**
    * The unique identifier for the user.
    */
  var userId: UserId
}
object AssociateUserToPermissionGroupRequest {
  
  inline def apply(permissionGroupId: PermissionGroupId, userId: UserId): AssociateUserToPermissionGroupRequest = {
    val __obj = js.Dynamic.literal(permissionGroupId = permissionGroupId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateUserToPermissionGroupRequest]
  }
  
  extension [Self <: AssociateUserToPermissionGroupRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
