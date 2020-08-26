package typings.awsSdk.batchMod

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
  @scala.inline
  implicit class DeleteJobQueueRequestOps[Self <: DeleteJobQueueRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobQueue(value: String): Self = this.set("jobQueue", value.asInstanceOf[js.Any])
  }
  
}

