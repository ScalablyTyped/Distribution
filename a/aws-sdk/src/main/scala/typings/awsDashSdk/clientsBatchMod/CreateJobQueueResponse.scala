package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobQueueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String = js.native
  /**
    * The name of the job queue.
    */
  var jobQueueName: String = js.native
}

object CreateJobQueueResponse {
  @scala.inline
  def apply(jobQueueArn: String, jobQueueName: String): CreateJobQueueResponse = {
    val __obj = js.Dynamic.literal(jobQueueArn = jobQueueArn.asInstanceOf[js.Any], jobQueueName = jobQueueName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateJobQueueResponse]
  }
}

