package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.native
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[QueueName] = js.native
  /**
    * The type of queue.
    */
  var QueueType: js.UndefOr[typings.awsDashSdk.clientsConnectMod.QueueType] = js.native
}

object QueueSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: QueueId = null, Name: QueueName = null, QueueType: QueueType = null): QueueSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (QueueType != null) __obj.updateDynamic("QueueType")(QueueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueSummary]
  }
}

