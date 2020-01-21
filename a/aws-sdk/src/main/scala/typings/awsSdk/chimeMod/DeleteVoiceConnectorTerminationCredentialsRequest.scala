package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
  /**
    * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object DeleteVoiceConnectorTerminationCredentialsRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString, Usernames: SensitiveStringList = null): DeleteVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (Usernames != null) __obj.updateDynamic("Usernames")(Usernames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
  }
}

