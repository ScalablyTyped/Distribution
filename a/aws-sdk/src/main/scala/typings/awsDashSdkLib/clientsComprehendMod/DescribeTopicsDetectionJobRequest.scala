package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTopicsDetectionJobRequest extends js.Object {
  /**
    * The identifier assigned by the user to the detection job.
    */
  var JobId: awsDashSdkLib.clientsComprehendMod.JobId
}

object DescribeTopicsDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeTopicsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribeTopicsDetectionJobRequest]
  }
}

