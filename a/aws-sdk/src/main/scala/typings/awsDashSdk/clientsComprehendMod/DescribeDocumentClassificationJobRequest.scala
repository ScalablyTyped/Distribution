package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentClassificationJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsDashSdk.clientsComprehendMod.JobId
}

object DescribeDocumentClassificationJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeDocumentClassificationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribeDocumentClassificationJobRequest]
  }
}

