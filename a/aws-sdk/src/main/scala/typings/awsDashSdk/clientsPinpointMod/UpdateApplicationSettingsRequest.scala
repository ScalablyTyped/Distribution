package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationSettingsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var WriteApplicationSettingsRequest: typings.awsDashSdk.clientsPinpointMod.WriteApplicationSettingsRequest = js.native
}

object UpdateApplicationSettingsRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): UpdateApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApplicationSettingsRequest]
  }
}

