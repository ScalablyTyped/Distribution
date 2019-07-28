package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagQueueRequest extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: String
  /**
    * The list of tags to be added to the specified queue.
    */
  var Tags: TagMap
}

object TagQueueRequest {
  @scala.inline
  def apply(QueueUrl: String, Tags: TagMap): TagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl, Tags = Tags)
  
    __obj.asInstanceOf[TagQueueRequest]
  }
}

