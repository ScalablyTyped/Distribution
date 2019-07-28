package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueReference extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of queue.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * The ID of the queue associated with the metrics returned.
    */
  var Id: js.UndefOr[QueueId] = js.undefined
}

object QueueReference {
  @scala.inline
  def apply(Arn: ARN = null, Id: QueueId = null): QueueReference = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[QueueReference]
  }
}

