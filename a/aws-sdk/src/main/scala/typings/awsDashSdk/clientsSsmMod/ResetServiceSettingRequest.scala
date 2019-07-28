package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to reset.
    */
  var SettingId: ServiceSettingId
}

object ResetServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId): ResetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId)
  
    __obj.asInstanceOf[ResetServiceSettingRequest]
  }
}

