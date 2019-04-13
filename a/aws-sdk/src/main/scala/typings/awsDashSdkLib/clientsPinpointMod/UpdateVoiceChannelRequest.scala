package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVoiceChannelRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var VoiceChannelRequest: awsDashSdkLib.clientsPinpointMod.VoiceChannelRequest
}

object UpdateVoiceChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, VoiceChannelRequest: VoiceChannelRequest): UpdateVoiceChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, VoiceChannelRequest = VoiceChannelRequest)
  
    __obj.asInstanceOf[UpdateVoiceChannelRequest]
  }
}

