package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobQueueRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the queue to delete.
    */
  var jobQueue: String = js.native
}

object DeleteJobQueueRequest {
  @scala.inline
  def apply(jobQueue: String): DeleteJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteJobQueueRequest]
  }
}

