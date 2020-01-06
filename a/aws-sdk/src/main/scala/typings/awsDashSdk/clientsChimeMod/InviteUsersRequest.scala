package typings.awsDashSdk.clientsChimeMod

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
  var UserEmailList: typings.awsDashSdk.clientsChimeMod.UserEmailList = js.native
}

object InviteUsersRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserEmailList: UserEmailList): InviteUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserEmailList = UserEmailList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InviteUsersRequest]
  }
}

