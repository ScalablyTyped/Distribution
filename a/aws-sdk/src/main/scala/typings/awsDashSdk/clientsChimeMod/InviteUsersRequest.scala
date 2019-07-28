package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteUsersRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The user email addresses to which to send the invite.
    */
  var UserEmailList: typings.awsDashSdk.clientsChimeMod.UserEmailList
}

object InviteUsersRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserEmailList: UserEmailList): InviteUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserEmailList = UserEmailList)
  
    __obj.asInstanceOf[InviteUsersRequest]
  }
}

