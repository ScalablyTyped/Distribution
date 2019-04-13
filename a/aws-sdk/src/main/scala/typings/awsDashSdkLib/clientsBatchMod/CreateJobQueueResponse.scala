package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobQueueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: String
  /**
    * The name of the job queue.
    */
  var jobQueueName: String
}

object CreateJobQueueResponse {
  @scala.inline
  def apply(jobQueueArn: String, jobQueueName: String): CreateJobQueueResponse = {
    val __obj = js.Dynamic.literal(jobQueueArn = jobQueueArn, jobQueueName = jobQueueName)
  
    __obj.asInstanceOf[CreateJobQueueResponse]
  }
}

