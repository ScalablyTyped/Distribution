package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationSettingsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var WriteApplicationSettingsRequest: awsDashSdkLib.clientsPinpointMod.WriteApplicationSettingsRequest
}

object UpdateApplicationSettingsRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): UpdateApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, WriteApplicationSettingsRequest = WriteApplicationSettingsRequest)
  
    __obj.asInstanceOf[UpdateApplicationSettingsRequest]
  }
}

