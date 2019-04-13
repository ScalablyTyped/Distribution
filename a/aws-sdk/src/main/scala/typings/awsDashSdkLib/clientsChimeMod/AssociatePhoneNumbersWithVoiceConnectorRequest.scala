package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}

object AssociatePhoneNumbersWithVoiceConnectorRequest {
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString, E164PhoneNumbers: E164PhoneNumberList = null): AssociatePhoneNumbersWithVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId)
    if (E164PhoneNumbers != null) __obj.updateDynamic("E164PhoneNumbers")(E164PhoneNumbers)
    __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorRequest]
  }
}

