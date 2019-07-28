package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBuilderStateChangeReason extends js.Object {
  /**
    * The state change reason code.
    */
  var Code: js.UndefOr[ImageBuilderStateChangeReasonCode] = js.undefined
  /**
    * The state change reason message.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object ImageBuilderStateChangeReason {
  @scala.inline
  def apply(Code: ImageBuilderStateChangeReasonCode = null, Message: String = null): ImageBuilderStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ImageBuilderStateChangeReason]
  }
}

