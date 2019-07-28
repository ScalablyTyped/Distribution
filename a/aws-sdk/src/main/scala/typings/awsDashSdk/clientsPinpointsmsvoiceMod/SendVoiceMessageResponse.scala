package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendVoiceMessageResponse extends js.Object {
  /**
    * A unique identifier for the voice message.
    */
  var MessageId: js.UndefOr[String] = js.undefined
}

object SendVoiceMessageResponse {
  @scala.inline
  def apply(MessageId: String = null): SendVoiceMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    __obj.asInstanceOf[SendVoiceMessageResponse]
  }
}

