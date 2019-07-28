package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAccountSettingResponse extends js.Object {
  /**
    * The account setting for the specified principal ARN.
    */
  var setting: js.UndefOr[Setting] = js.undefined
}

object DeleteAccountSettingResponse {
  @scala.inline
  def apply(setting: Setting = null): DeleteAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    if (setting != null) __obj.updateDynamic("setting")(setting)
    __obj.asInstanceOf[DeleteAccountSettingResponse]
  }
}

