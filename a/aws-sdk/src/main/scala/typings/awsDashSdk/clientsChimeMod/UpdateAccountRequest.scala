package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAccountRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The new name for the specified Amazon Chime account.
    */
  var Name: js.UndefOr[AccountName] = js.undefined
}

object UpdateAccountRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, Name: AccountName = null): UpdateAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateAccountRequest]
  }
}

