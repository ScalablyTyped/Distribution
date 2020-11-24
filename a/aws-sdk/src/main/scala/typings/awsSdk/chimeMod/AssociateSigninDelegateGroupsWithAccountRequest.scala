package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSigninDelegateGroupsWithAccountRequest extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The sign-in delegate groups.
    */
  var SigninDelegateGroups: SigninDelegateGroupList = js.native
}
object AssociateSigninDelegateGroupsWithAccountRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, SigninDelegateGroups: SigninDelegateGroupList): AssociateSigninDelegateGroupsWithAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], SigninDelegateGroups = SigninDelegateGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSigninDelegateGroupsWithAccountRequest]
  }
  
  @scala.inline
  implicit class AssociateSigninDelegateGroupsWithAccountRequestOps[Self <: AssociateSigninDelegateGroupsWithAccountRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigninDelegateGroupsVarargs(value: SigninDelegateGroup*): Self = this.set("SigninDelegateGroups", js.Array(value :_*))
    
    @scala.inline
    def setSigninDelegateGroups(value: SigninDelegateGroupList): Self = this.set("SigninDelegateGroups", value.asInstanceOf[js.Any])
  }
}
