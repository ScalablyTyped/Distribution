package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateSigninDelegateGroupsFromAccountRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The sign-in delegate group names.
    */
  var GroupNames: NonEmptyStringList = js.native
}

object DisassociateSigninDelegateGroupsFromAccountRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, GroupNames: NonEmptyStringList): DisassociateSigninDelegateGroupsFromAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], GroupNames = GroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSigninDelegateGroupsFromAccountRequest]
  }
  @scala.inline
  implicit class DisassociateSigninDelegateGroupsFromAccountRequestOps[Self <: DisassociateSigninDelegateGroupsFromAccountRequest] (val x: Self) extends AnyVal {
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
    def setGroupNamesVarargs(value: String*): Self = this.set("GroupNames", js.Array(value :_*))
    @scala.inline
    def setGroupNames(value: NonEmptyStringList): Self = this.set("GroupNames", value.asInstanceOf[js.Any])
  }
  
}

