package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAccountSettingResponse extends js.Object {
  /**
    * The current account setting for a resource.
    */
  var setting: js.UndefOr[Setting] = js.undefined
}

object PutAccountSettingResponse {
  @scala.inline
  def apply(setting: Setting = null): PutAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    if (setting != null) __obj.updateDynamic("setting")(setting)
    __obj.asInstanceOf[PutAccountSettingResponse]
  }
}

