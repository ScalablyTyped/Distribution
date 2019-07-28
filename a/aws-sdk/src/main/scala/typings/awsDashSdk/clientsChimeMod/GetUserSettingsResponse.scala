package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserSettingsResponse extends js.Object {
  /**
    * The user settings.
    */
  var UserSettings: js.UndefOr[typings.awsDashSdk.clientsChimeMod.UserSettings] = js.undefined
}

object GetUserSettingsResponse {
  @scala.inline
  def apply(UserSettings: UserSettings = null): GetUserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings)
    __obj.asInstanceOf[GetUserSettingsResponse]
  }
}

