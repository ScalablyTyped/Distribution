package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqsParameters extends js.Object {
  /**
    * The FIFO message group ID to use as the target.
    */
  var MessageGroupId: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.MessageGroupId] = js.native
}

object SqsParameters {
  @scala.inline
  def apply(MessageGroupId: MessageGroupId = null): SqsParameters = {
    val __obj = js.Dynamic.literal()
    if (MessageGroupId != null) __obj.updateDynamic("MessageGroupId")(MessageGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqsParameters]
  }
}

