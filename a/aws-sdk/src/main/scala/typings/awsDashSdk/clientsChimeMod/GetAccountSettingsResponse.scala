package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSettingsResponse extends js.Object {
  /**
    * The Amazon Chime account settings.
    */
  var AccountSettings: js.UndefOr[typings.awsDashSdk.clientsChimeMod.AccountSettings] = js.undefined
}

object GetAccountSettingsResponse {
  @scala.inline
  def apply(AccountSettings: AccountSettings = null): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountSettings != null) __obj.updateDynamic("AccountSettings")(AccountSettings)
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
}

