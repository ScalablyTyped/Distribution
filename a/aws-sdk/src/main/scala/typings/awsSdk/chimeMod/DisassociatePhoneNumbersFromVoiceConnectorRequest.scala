package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString = js.native
}

object DisassociatePhoneNumbersFromVoiceConnectorRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString, E164PhoneNumbers: E164PhoneNumberList = null): DisassociatePhoneNumbersFromVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    if (E164PhoneNumbers != null) __obj.updateDynamic("E164PhoneNumbers")(E164PhoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorRequest]
  }
}

