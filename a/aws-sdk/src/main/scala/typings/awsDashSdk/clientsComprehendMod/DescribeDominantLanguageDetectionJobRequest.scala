package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsDashSdk.clientsComprehendMod.JobId
}

object DescribeDominantLanguageDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeDominantLanguageDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobRequest]
  }
}

