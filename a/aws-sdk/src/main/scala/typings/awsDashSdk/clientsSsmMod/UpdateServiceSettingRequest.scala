package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to update.
    */
  var SettingId: ServiceSettingId = js.native
  /**
    * The new value to specify for the service setting.
    */
  var SettingValue: ServiceSettingValue = js.native
}

object UpdateServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId, SettingValue: ServiceSettingValue): UpdateServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any], SettingValue = SettingValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateServiceSettingRequest]
  }
}

