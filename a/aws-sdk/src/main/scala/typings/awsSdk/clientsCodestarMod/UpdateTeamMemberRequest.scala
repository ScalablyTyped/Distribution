package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTeamMemberRequest extends StObject {
  
  /**
    * The ID of the project.
    */
  var projectId: ProjectId
  
  /**
    * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide.
    */
  var projectRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile. Even if this is set to True, the user must associate a public key with their profile before the user can access resources.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user for whom you want to change team membership attributes.
    */
  var userArn: UserArn
}
object UpdateTeamMemberRequest {
  
  inline def apply(projectId: ProjectId, userArn: UserArn): UpdateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTeamMemberRequest]
  }
  
  extension [Self <: UpdateTeamMemberRequest](x: Self) {
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectRole(value: Role): Self = StObject.set(x, "projectRole", value.asInstanceOf[js.Any])
    
    inline def setProjectRoleUndefined: Self = StObject.set(x, "projectRole", js.undefined)
    
    inline def setRemoteAccessAllowed(value: RemoteAccessAllowed): Self = StObject.set(x, "remoteAccessAllowed", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessAllowedUndefined: Self = StObject.set(x, "remoteAccessAllowed", js.undefined)
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
