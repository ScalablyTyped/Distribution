package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceSettingResult extends js.Object {
  /**
    * The query result of the current service setting.
    */
  var ServiceSetting: js.UndefOr[ServiceSetting] = js.undefined
}

object GetServiceSettingResult {
  @scala.inline
  def apply(ServiceSetting: ServiceSetting = null): GetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    if (ServiceSetting != null) __obj.updateDynamic("ServiceSetting")(ServiceSetting)
    __obj.asInstanceOf[GetServiceSettingResult]
  }
}

