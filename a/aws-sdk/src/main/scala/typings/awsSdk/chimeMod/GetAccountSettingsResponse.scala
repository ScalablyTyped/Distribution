package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsResponse extends js.Object {
  /**
    * The Amazon Chime account settings.
    */
  var AccountSettings: js.UndefOr[typings.awsSdk.chimeMod.AccountSettings] = js.native
}

object GetAccountSettingsResponse {
  @scala.inline
  def apply(AccountSettings: AccountSettings = null): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountSettings != null) __obj.updateDynamic("AccountSettings")(AccountSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
}

