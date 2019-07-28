package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetServiceSettingResult extends js.Object {
  /**
    * The current, effective service setting after calling the ResetServiceSetting API action.
    */
  var ServiceSetting: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ServiceSetting] = js.undefined
}

object ResetServiceSettingResult {
  @scala.inline
  def apply(ServiceSetting: ServiceSetting = null): ResetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    if (ServiceSetting != null) __obj.updateDynamic("ServiceSetting")(ServiceSetting)
    __obj.asInstanceOf[ResetServiceSettingResult]
  }
}

