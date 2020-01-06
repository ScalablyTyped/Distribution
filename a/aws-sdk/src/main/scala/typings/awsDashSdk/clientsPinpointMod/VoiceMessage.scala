package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceMessage extends js.Object {
  /**
    * The text of the script to use for the voice message.
    */
  var Body: js.UndefOr[__string] = js.native
  /**
    * The code for the language to use when synthesizing the text of the message script. For a list of supported languages and the code for each one, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[__string] = js.native
  /**
    * The long code to send the voice message from. This value should be one of the dedicated long codes that's assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164 format, for example +12065550100, to ensure prompt and accurate delivery of the message.
    */
  var OriginationNumber: js.UndefOr[__string] = js.native
  /**
    * The default message variables to use in the voice message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.native
  /**
    * The name of the voice to use when delivering the message. For a list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[__string] = js.native
}

object VoiceMessage {
  @scala.inline
  def apply(
    Body: __string = null,
    LanguageCode: __string = null,
    OriginationNumber: __string = null,
    Substitutions: MapOfListOf__string = null,
    VoiceId: __string = null
  ): VoiceMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (OriginationNumber != null) __obj.updateDynamic("OriginationNumber")(OriginationNumber.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (VoiceId != null) __obj.updateDynamic("VoiceId")(VoiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceMessage]
  }
}

