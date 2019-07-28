package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendVoiceMessageRequest extends js.Object {
  /**
    * The phone number that appears on recipients' devices when they receive the message.
    */
  var CallerId: js.UndefOr[String] = js.undefined
  /**
    * The name of the configuration set that you want to use to send the message.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined
  var Content: js.UndefOr[VoiceMessageContent] = js.undefined
  /**
    * The phone number that you want to send the voice message to.
    */
  var DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone number that appears on recipients' devices when they receive the message, because you can specify a CallerId parameter in the request.
    */
  var OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
}

object SendVoiceMessageRequest {
  @scala.inline
  def apply(
    CallerId: String = null,
    ConfigurationSetName: WordCharactersWithDelimiters = null,
    Content: VoiceMessageContent = null,
    DestinationPhoneNumber: NonEmptyString = null,
    OriginationPhoneNumber: NonEmptyString = null
  ): SendVoiceMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (CallerId != null) __obj.updateDynamic("CallerId")(CallerId)
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (DestinationPhoneNumber != null) __obj.updateDynamic("DestinationPhoneNumber")(DestinationPhoneNumber)
    if (OriginationPhoneNumber != null) __obj.updateDynamic("OriginationPhoneNumber")(OriginationPhoneNumber)
    __obj.asInstanceOf[SendVoiceMessageRequest]
  }
}

