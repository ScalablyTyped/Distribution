package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendBounceResponse extends js.Object {
  /**
    * The message ID of the bounce message.
    */
  var MessageId: js.UndefOr[typings.awsDashSdk.clientsSesMod.MessageId] = js.undefined
}

object SendBounceResponse {
  @scala.inline
  def apply(MessageId: MessageId = null): SendBounceResponse = {
    val __obj = js.Dynamic.literal()
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    __obj.asInstanceOf[SendBounceResponse]
  }
}

