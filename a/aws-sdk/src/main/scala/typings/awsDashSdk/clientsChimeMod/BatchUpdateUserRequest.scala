package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The request containing the user IDs and details to update.
    */
  var UpdateUserRequestItems: UpdateUserRequestItemList = js.native
}

object BatchUpdateUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UpdateUserRequestItems: UpdateUserRequestItemList): BatchUpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UpdateUserRequestItems = UpdateUserRequestItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchUpdateUserRequest]
  }
}

