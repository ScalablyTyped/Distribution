package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteUsersResponse extends js.Object {
  
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
  implicit class InviteUsersResponseOps[Self <: InviteUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvitesVarargs(value: Invite*): Self = this.set("Invites", js.Array(value :_*))
    
    @scala.inline
    def setInvites(value: InviteList): Self = this.set("Invites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvites: Self = this.set("Invites", js.undefined)
  }
}
