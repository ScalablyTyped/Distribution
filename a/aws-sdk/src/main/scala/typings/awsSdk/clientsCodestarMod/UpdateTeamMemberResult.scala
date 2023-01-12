package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTeamMemberResult extends StObject {
  
  /**
    * The project role granted to the user.
    */
  var projectRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
    */
  var userArn: js.UndefOr[UserArn] = js.undefined
}
object UpdateTeamMemberResult {
  
  inline def apply(): UpdateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTeamMemberResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTeamMemberResult] (val x: Self) extends AnyVal {
    
    inline def setProjectRole(value: Role): Self = StObject.set(x, "projectRole", value.asInstanceOf[js.Any])
    
    inline def setProjectRoleUndefined: Self = StObject.set(x, "projectRole", js.undefined)
    
    inline def setRemoteAccessAllowed(value: RemoteAccessAllowed): Self = StObject.set(x, "remoteAccessAllowed", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessAllowedUndefined: Self = StObject.set(x, "remoteAccessAllowed", js.undefined)
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
  }
}
