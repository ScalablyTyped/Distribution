package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobQueueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the job queue.
    */
  var jobQueueName: js.UndefOr[String] = js.undefined
}

object UpdateJobQueueResponse {
  @scala.inline
  def apply(jobQueueArn: String = null, jobQueueName: String = null): UpdateJobQueueResponse = {
    val __obj = js.Dynamic.literal()
    if (jobQueueArn != null) __obj.updateDynamic("jobQueueArn")(jobQueueArn)
    if (jobQueueName != null) __obj.updateDynamic("jobQueueName")(jobQueueName)
    __obj.asInstanceOf[UpdateJobQueueResponse]
  }
}

