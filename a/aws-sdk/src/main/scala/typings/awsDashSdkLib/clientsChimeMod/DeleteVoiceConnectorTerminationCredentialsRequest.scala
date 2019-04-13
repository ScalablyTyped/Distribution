package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
  /**
    * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.undefined
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object DeleteVoiceConnectorTerminationCredentialsRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString, Usernames: SensitiveStringList = null): DeleteVoiceConnectorTerminationCredentialsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId)
    if (Usernames != null) __obj.updateDynamic("Usernames")(Usernames)
    __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
  }
}

