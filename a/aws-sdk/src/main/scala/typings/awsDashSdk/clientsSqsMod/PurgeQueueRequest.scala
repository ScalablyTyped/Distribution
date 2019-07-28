package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurgeQueueRequest extends js.Object {
  /**
    * The URL of the queue from which the PurgeQueue action deletes messages. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}

object PurgeQueueRequest {
  @scala.inline
  def apply(QueueUrl: String): PurgeQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[PurgeQueueRequest]
  }
}

