package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to get.
    */
  var SettingId: ServiceSettingId
}

object GetServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId): GetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId)
  
    __obj.asInstanceOf[GetServiceSettingRequest]
  }
}

