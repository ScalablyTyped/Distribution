package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceConnectorRequest extends js.Object {
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName = js.native
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object UpdateVoiceConnectorRequest {
  @scala.inline
  def apply(Name: VoiceConnectorName, RequireEncryption: Boolean, VoiceConnectorId: NonEmptyString): UpdateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceConnectorRequest]
  }
}

