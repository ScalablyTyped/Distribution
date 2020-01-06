package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceSettingResult extends js.Object {
  /**
    * The query result of the current service setting.
    */
  var ServiceSetting: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ServiceSetting] = js.native
}

object GetServiceSettingResult {
  @scala.inline
  def apply(ServiceSetting: ServiceSetting = null): GetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    if (ServiceSetting != null) __obj.updateDynamic("ServiceSetting")(ServiceSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceSettingResult]
  }
}

