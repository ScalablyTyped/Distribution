package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsVoipSandboxChannelRequest extends js.Object {
  var APNSVoipSandboxChannelRequest: typings.awsDashSdk.clientsPinpointMod.APNSVoipSandboxChannelRequest
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
}

object UpdateApnsVoipSandboxChannelRequest {
  @scala.inline
  def apply(APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest, ApplicationId: __string): UpdateApnsVoipSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelRequest = APNSVoipSandboxChannelRequest, ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelRequest]
  }
}

