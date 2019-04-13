package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceMessage extends js.Object {
  /**
    * The message body of the notification, the email body or the text message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * Language of sent message
    */
  var LanguageCode: js.UndefOr[__string] = js.undefined
  /**
    * Is the number from the pool or messaging service to send from.
    */
  var OriginationNumber: js.UndefOr[__string] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * Voice ID of sent message.
    */
  var VoiceId: js.UndefOr[__string] = js.undefined
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
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode)
    if (OriginationNumber != null) __obj.updateDynamic("OriginationNumber")(OriginationNumber)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (VoiceId != null) __obj.updateDynamic("VoiceId")(VoiceId)
    __obj.asInstanceOf[VoiceMessage]
  }
}

