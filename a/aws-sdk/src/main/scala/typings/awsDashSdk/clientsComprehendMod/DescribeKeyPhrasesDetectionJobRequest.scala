package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeKeyPhrasesDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsDashSdk.clientsComprehendMod.JobId
}

object DescribeKeyPhrasesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobRequest]
  }
}

