package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSettingsResult extends js.Object {
  /**
    * The account settings.
    */
  var accountSettings: js.UndefOr[AccountSettings] = js.undefined
}

object GetAccountSettingsResult {
  @scala.inline
  def apply(accountSettings: AccountSettings = null): GetAccountSettingsResult = {
    val __obj = js.Dynamic.literal()
    if (accountSettings != null) __obj.updateDynamic("accountSettings")(accountSettings)
    __obj.asInstanceOf[GetAccountSettingsResult]
  }
}

