package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishResponse extends js.Object {
  /**
    * Unique identifier assigned to the published message. Length Constraint: Maximum 100 characters
    */
  var MessageId: js.UndefOr[messageId] = js.native
}

object PublishResponse {
  @scala.inline
  def apply(MessageId: messageId = null): PublishResponse = {
    val __obj = js.Dynamic.literal()
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishResponse]
  }
}

