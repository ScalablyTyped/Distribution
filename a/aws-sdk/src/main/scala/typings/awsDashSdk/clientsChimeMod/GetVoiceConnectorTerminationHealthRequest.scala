package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoiceConnectorTerminationHealthRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object GetVoiceConnectorTerminationHealthRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorTerminationHealthRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId)
  
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthRequest]
  }
}

