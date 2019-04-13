package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqsParameters extends js.Object {
  /**
    * The FIFO message group ID to use as the target.
    */
  var MessageGroupId: js.UndefOr[MessageGroupId] = js.undefined
}

object SqsParameters {
  @scala.inline
  def apply(MessageGroupId: MessageGroupId = null): SqsParameters = {
    val __obj = js.Dynamic.literal()
    if (MessageGroupId != null) __obj.updateDynamic("MessageGroupId")(MessageGroupId)
    __obj.asInstanceOf[SqsParameters]
  }
}

