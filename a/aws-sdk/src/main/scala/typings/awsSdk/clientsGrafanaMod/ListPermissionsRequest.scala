package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionsRequest extends StObject {
  
  /**
    * (Optional) Limits the results to only the group that matches this ID.
    */
  var groupId: js.UndefOr[SsoId] = js.undefined
  
  /**
    * The maximum number of results to include in the response.
    */
  var maxResults: js.UndefOr[ListPermissionsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token to use when requesting the next set of results. You received this token from a previous ListPermissions operation.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * (Optional) Limits the results to only the user that matches this ID.
    */
  var userId: js.UndefOr[SsoId] = js.undefined
  
  /**
    * (Optional) If you specify SSO_USER, then only the permissions of Amazon Web Services SSO users are returned. If you specify SSO_GROUP, only the permissions of Amazon Web Services SSO groups are returned.
    */
  var userType: js.UndefOr[UserType] = js.undefined
  
  /**
    * The ID of the workspace to list permissions for. This parameter is required.
    */
  var workspaceId: WorkspaceId
}
object ListPermissionsRequest {
  
  inline def apply(workspaceId: WorkspaceId): ListPermissionsRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionsRequest]
  }
  
  extension [Self <: ListPermissionsRequest](x: Self) {
    
    inline def setGroupId(value: SsoId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setMaxResults(value: ListPermissionsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUserId(value: SsoId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "userType", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
