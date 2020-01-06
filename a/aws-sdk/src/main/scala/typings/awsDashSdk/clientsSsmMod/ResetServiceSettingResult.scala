package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetServiceSettingResult extends js.Object {
  /**
    * The current, effective service setting after calling the ResetServiceSetting API action.
    */
  var ServiceSetting: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ServiceSetting] = js.native
}

object ResetServiceSettingResult {
  @scala.inline
  def apply(ServiceSetting: ServiceSetting = null): ResetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    if (ServiceSetting != null) __obj.updateDynamic("ServiceSetting")(ServiceSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetServiceSettingResult]
  }
}

