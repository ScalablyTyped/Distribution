package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePHIDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend Medical generated for the job. The StartPHIDetectionJob operation returns this identifier in its response.
    */
  var JobId: typings.awsDashSdk.clientsComprehendmedicalMod.JobId
}

object DescribePHIDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribePHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribePHIDetectionJobRequest]
  }
}

