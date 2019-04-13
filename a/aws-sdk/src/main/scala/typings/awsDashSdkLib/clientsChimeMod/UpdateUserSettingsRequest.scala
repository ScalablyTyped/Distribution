package typings
package awsDashSdkLib.clientsChimeMod

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
  var UserSettings: awsDashSdkLib.clientsChimeMod.UserSettings
}

object UpdateUserSettingsRequest {
  @scala.inline
  def apply(AccountId: String, UserId: String, UserSettings: UserSettings): UpdateUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserId = UserId, UserSettings = UserSettings)
  
    __obj.asInstanceOf[UpdateUserSettingsRequest]
  }
}

