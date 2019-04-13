package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueueResult extends js.Object {
  /**
    * The URL of the created Amazon SQS queue.
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}

object CreateQueueResult {
  @scala.inline
  def apply(QueueUrl: String = null): CreateQueueResult = {
    val __obj = js.Dynamic.literal()
    if (QueueUrl != null) __obj.updateDynamic("QueueUrl")(QueueUrl)
    __obj.asInstanceOf[CreateQueueResult]
  }
}

