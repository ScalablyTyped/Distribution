package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAccountSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The Amazon Chime account settings to update.
    */
  var AccountSettings: typings.awsDashSdk.clientsChimeMod.AccountSettings
}

object UpdateAccountSettingsRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, AccountSettings: AccountSettings): UpdateAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, AccountSettings = AccountSettings)
  
    __obj.asInstanceOf[UpdateAccountSettingsRequest]
  }
}

