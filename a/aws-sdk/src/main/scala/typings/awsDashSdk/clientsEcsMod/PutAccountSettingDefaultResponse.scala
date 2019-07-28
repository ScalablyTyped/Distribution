package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAccountSettingDefaultResponse extends js.Object {
  var setting: js.UndefOr[Setting] = js.undefined
}

object PutAccountSettingDefaultResponse {
  @scala.inline
  def apply(setting: Setting = null): PutAccountSettingDefaultResponse = {
    val __obj = js.Dynamic.literal()
    if (setting != null) __obj.updateDynamic("setting")(setting)
    __obj.asInstanceOf[PutAccountSettingDefaultResponse]
  }
}

