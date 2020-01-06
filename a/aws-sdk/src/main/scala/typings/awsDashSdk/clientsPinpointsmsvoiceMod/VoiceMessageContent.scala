package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceMessageContent extends js.Object {
  var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.native
  var PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.native
  var SSMLMessage: js.UndefOr[SSMLMessageType] = js.native
}

object VoiceMessageContent {
  @scala.inline
  def apply(
    CallInstructionsMessage: CallInstructionsMessageType = null,
    PlainTextMessage: PlainTextMessageType = null,
    SSMLMessage: SSMLMessageType = null
  ): VoiceMessageContent = {
    val __obj = js.Dynamic.literal()
    if (CallInstructionsMessage != null) __obj.updateDynamic("CallInstructionsMessage")(CallInstructionsMessage.asInstanceOf[js.Any])
    if (PlainTextMessage != null) __obj.updateDynamic("PlainTextMessage")(PlainTextMessage.asInstanceOf[js.Any])
    if (SSMLMessage != null) __obj.updateDynamic("SSMLMessage")(SSMLMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceMessageContent]
  }
}

