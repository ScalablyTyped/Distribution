package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

