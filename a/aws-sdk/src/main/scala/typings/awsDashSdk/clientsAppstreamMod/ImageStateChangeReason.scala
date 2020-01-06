package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageStateChangeReason extends js.Object {
  /**
    * The state change reason code.
    */
  var Code: js.UndefOr[ImageStateChangeReasonCode] = js.native
  /**
    * The state change reason message.
    */
  var Message: js.UndefOr[String] = js.native
}

object ImageStateChangeReason {
  @scala.inline
  def apply(Code: ImageStateChangeReasonCode = null, Message: String = null): ImageStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStateChangeReason]
  }
}

