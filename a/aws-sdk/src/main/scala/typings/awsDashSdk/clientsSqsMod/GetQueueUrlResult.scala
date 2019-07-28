package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueUrlResult extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}

object GetQueueUrlResult {
  @scala.inline
  def apply(QueueUrl: String = null): GetQueueUrlResult = {
    val __obj = js.Dynamic.literal()
    if (QueueUrl != null) __obj.updateDynamic("QueueUrl")(QueueUrl)
    __obj.asInstanceOf[GetQueueUrlResult]
  }
}

