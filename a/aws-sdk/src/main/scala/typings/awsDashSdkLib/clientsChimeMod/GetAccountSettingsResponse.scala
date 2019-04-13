package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSettingsResponse extends js.Object {
  /**
    * The Amazon Chime account settings.
    */
  var AccountSettings: js.UndefOr[AccountSettings] = js.undefined
}

object GetAccountSettingsResponse {
  @scala.inline
  def apply(AccountSettings: AccountSettings = null): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountSettings != null) __obj.updateDynamic("AccountSettings")(AccountSettings)
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
}

