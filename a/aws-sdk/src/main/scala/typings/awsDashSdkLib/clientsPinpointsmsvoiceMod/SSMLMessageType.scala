package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSMLMessageType extends js.Object {
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[String] = js.undefined
  /**
    * The SSML-formatted text to deliver to the recipient.
    */
  var Text: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[String] = js.undefined
}

object SSMLMessageType {
  @scala.inline
  def apply(LanguageCode: String = null, Text: NonEmptyString = null, VoiceId: String = null): SSMLMessageType = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode)
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (VoiceId != null) __obj.updateDynamic("VoiceId")(VoiceId)
    __obj.asInstanceOf[SSMLMessageType]
  }
}

