package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntitiesDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsDashSdk.clientsComprehendMod.JobId
}

object DescribeEntitiesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribeEntitiesDetectionJobRequest]
  }
}

