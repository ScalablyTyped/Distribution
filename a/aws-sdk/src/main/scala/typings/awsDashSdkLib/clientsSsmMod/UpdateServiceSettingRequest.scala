package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to update.
    */
  var SettingId: ServiceSettingId
  /**
    * The new value to specify for the service setting.
    */
  var SettingValue: ServiceSettingValue
}

object UpdateServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId, SettingValue: ServiceSettingValue): UpdateServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId, SettingValue = SettingValue)
  
    __obj.asInstanceOf[UpdateServiceSettingRequest]
  }
}

