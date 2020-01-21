package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteUsersRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The user email addresses to which to send the email invitation.
    */
  var UserEmailList: typings.awsSdk.chimeMod.UserEmailList = js.native
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.native
}

object InviteUsersRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserEmailList: UserEmailList, UserType: UserType = null): InviteUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserEmailList = UserEmailList.asInstanceOf[js.Any])
    if (UserType != null) __obj.updateDynamic("UserType")(UserType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteUsersRequest]
  }
}

