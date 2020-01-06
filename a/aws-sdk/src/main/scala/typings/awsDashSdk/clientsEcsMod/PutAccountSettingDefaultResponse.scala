package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountSettingDefaultResponse extends js.Object {
  var setting: js.UndefOr[Setting] = js.native
}

object PutAccountSettingDefaultResponse {
  @scala.inline
  def apply(setting: Setting = null): PutAccountSettingDefaultResponse = {
    val __obj = js.Dynamic.literal()
    if (setting != null) __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountSettingDefaultResponse]
  }
}

