package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeadLetterSourceQueuesRequest extends js.Object {
  /**
    * The URL of a dead-letter queue. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}

object ListDeadLetterSourceQueuesRequest {
  @scala.inline
  def apply(QueueUrl: String): ListDeadLetterSourceQueuesRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[ListDeadLetterSourceQueuesRequest]
  }
}

