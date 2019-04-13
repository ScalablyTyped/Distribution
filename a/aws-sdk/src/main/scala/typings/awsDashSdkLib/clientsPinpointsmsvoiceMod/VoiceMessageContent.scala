package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceMessageContent extends js.Object {
  var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.undefined
  var PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.undefined
  var SSMLMessage: js.UndefOr[SSMLMessageType] = js.undefined
}

object VoiceMessageContent {
  @scala.inline
  def apply(
    CallInstructionsMessage: CallInstructionsMessageType = null,
    PlainTextMessage: PlainTextMessageType = null,
    SSMLMessage: SSMLMessageType = null
  ): VoiceMessageContent = {
    val __obj = js.Dynamic.literal()
    if (CallInstructionsMessage != null) __obj.updateDynamic("CallInstructionsMessage")(CallInstructionsMessage)
    if (PlainTextMessage != null) __obj.updateDynamic("PlainTextMessage")(PlainTextMessage)
    if (SSMLMessage != null) __obj.updateDynamic("SSMLMessage")(SSMLMessage)
    __obj.asInstanceOf[VoiceMessageContent]
  }
}

