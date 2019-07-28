package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveMessageResult extends js.Object {
  /**
    * A list of messages.
    */
  var Messages: js.UndefOr[MessageList] = js.undefined
}

object ReceiveMessageResult {
  @scala.inline
  def apply(Messages: MessageList = null): ReceiveMessageResult = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    __obj.asInstanceOf[ReceiveMessageResult]
  }
}

