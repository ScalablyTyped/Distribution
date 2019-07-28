package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueueTagsRequest extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: String
}

object ListQueueTagsRequest {
  @scala.inline
  def apply(QueueUrl: String): ListQueueTagsRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[ListQueueTagsRequest]
  }
}

