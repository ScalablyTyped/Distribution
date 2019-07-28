package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String
  /**
    * The user ID.
    */
  var UserId: String
  /**
    * The user settings to update.
    */
  var UserSettings: typings.awsDashSdk.clientsChimeMod.UserSettings
}

object UpdateUserSettingsRequest {
  @scala.inline
  def apply(AccountId: String, UserId: String, UserSettings: UserSettings): UpdateUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserId = UserId, UserSettings = UserSettings)
  
    __obj.asInstanceOf[UpdateUserSettingsRequest]
  }
}

