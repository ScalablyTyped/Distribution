package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVoiceConnectorRequest extends js.Object {
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object DeleteVoiceConnectorRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): DeleteVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId)
  
    __obj.asInstanceOf[DeleteVoiceConnectorRequest]
  }
}

