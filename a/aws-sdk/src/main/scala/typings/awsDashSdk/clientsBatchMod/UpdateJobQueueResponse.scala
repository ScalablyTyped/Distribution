package typings.awsDashSdk.clientsBatchMod

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
  def apply(jobQueueArn: String = null, jobQueueName: String = null): UpdateJobQueueResponse = {
    val __obj = js.Dynamic.literal()
    if (jobQueueArn != null) __obj.updateDynamic("jobQueueArn")(jobQueueArn.asInstanceOf[js.Any])
    if (jobQueueName != null) __obj.updateDynamic("jobQueueName")(jobQueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobQueueResponse]
  }
}

