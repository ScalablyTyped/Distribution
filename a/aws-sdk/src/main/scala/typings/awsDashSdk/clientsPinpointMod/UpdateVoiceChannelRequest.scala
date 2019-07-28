package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVoiceChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var VoiceChannelRequest: typings.awsDashSdk.clientsPinpointMod.VoiceChannelRequest
}

object UpdateVoiceChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, VoiceChannelRequest: VoiceChannelRequest): UpdateVoiceChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, VoiceChannelRequest = VoiceChannelRequest)
  
    __obj.asInstanceOf[UpdateVoiceChannelRequest]
  }
}

