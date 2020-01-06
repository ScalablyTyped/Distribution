package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  /**
    * The user ID.
    */
  var UserId: String = js.native
  /**
    * The user settings to update.
    */
  var UserSettings: typings.awsDashSdk.clientsChimeMod.UserSettings = js.native
}

object UpdateUserSettingsRequest {
  @scala.inline
  def apply(AccountId: String, UserId: String, UserSettings: UserSettings): UpdateUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any], UserSettings = UserSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateUserSettingsRequest]
  }
}

