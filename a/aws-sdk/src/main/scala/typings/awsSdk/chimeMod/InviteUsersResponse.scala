package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteUsersResponse extends StObject {
  
  /**
    * The email invitation details.
    */
  var Invites: js.UndefOr[InviteList] = js.native
}
object InviteUsersResponse {
  
  @scala.inline
  def apply(): InviteUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteUsersResponse]
  }
  
  @scala.inline
  implicit class InviteUsersResponseMutableBuilder[Self <: InviteUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvites(value: InviteList): Self = StObject.set(x, "Invites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitesUndefined: Self = StObject.set(x, "Invites", js.undefined)
    
    @scala.inline
    def setInvitesVarargs(value: Invite*): Self = StObject.set(x, "Invites", js.Array(value :_*))
  }
}
