package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVoiceConnectorRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object UpdateVoiceConnectorRequest {
  @scala.inline
  def apply(Name: VoiceConnectorName, RequireEncryption: Boolean, VoiceConnectorId: NonEmptyString): UpdateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name, RequireEncryption = RequireEncryption, VoiceConnectorId = VoiceConnectorId)
  
    __obj.asInstanceOf[UpdateVoiceConnectorRequest]
  }
}

