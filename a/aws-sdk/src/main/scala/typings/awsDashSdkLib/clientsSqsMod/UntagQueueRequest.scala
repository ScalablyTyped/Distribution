package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagQueueRequest extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: String
  /**
    * The list of tags to be removed from the specified queue.
    */
  var TagKeys: TagKeyList
}

object UntagQueueRequest {
  @scala.inline
  def apply(QueueUrl: String, TagKeys: TagKeyList): UntagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagQueueRequest]
  }
}

