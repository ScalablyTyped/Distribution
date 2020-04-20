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
}

