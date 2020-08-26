package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobQueueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: js.UndefOr[String] = js.native
  /**
    * The name of the job queue.
    */
  var jobQueueName: js.UndefOr[String] = js.native
}

object UpdateJobQueueResponse {
  @scala.inline
  def apply(): UpdateJobQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobQueueResponse]
  }
  @scala.inline
  implicit class UpdateJobQueueResponseOps[Self <: UpdateJobQueueResponse] (val x: Self) extends AnyVal {
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
    def setJobQueueArn(value: String): Self = this.set("jobQueueArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobQueueArn: Self = this.set("jobQueueArn", js.undefined)
    @scala.inline
    def setJobQueueName(value: String): Self = this.set("jobQueueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobQueueName: Self = this.set("jobQueueName", js.undefined)
  }
  
}

