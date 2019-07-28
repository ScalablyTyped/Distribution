package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeadLetterSourceQueuesResult extends js.Object {
  /**
    * A list of source queue URLs that have the RedrivePolicy queue attribute configured with a dead-letter queue.
    */
  var queueUrls: QueueUrlList
}

object ListDeadLetterSourceQueuesResult {
  @scala.inline
  def apply(queueUrls: QueueUrlList): ListDeadLetterSourceQueuesResult = {
    val __obj = js.Dynamic.literal(queueUrls = queueUrls)
  
    __obj.asInstanceOf[ListDeadLetterSourceQueuesResult]
  }
}

