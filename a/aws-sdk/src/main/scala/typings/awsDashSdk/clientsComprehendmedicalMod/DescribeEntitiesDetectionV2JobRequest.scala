package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntitiesDetectionV2JobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend Medical generated for the job. The StartEntitiesDetectionV2Job operation returns this identifier in its response.
    */
  var JobId: typings.awsDashSdk.clientsComprehendmedicalMod.JobId
}

object DescribeEntitiesDetectionV2JobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribeEntitiesDetectionV2JobRequest]
  }
}

