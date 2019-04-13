package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelJobRequest extends js.Object {
  /**
    * The AWS Batch job ID of the job to cancel.
    */
  var jobId: String
  /**
    * A message to attach to the job that explains the reason for canceling it. This message is returned by future DescribeJobs operations on the job. This message is also recorded in the AWS Batch activity logs. 
    */
  var reason: String
}

object CancelJobRequest {
  @scala.inline
  def apply(jobId: String, reason: String): CancelJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId, reason = reason)
  
    __obj.asInstanceOf[CancelJobRequest]
  }
}

