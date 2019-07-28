package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDocumentTextDetectionResponse extends js.Object {
  /**
    * The identifier for the document text-detection job. Use JobId to identify the job in a subsequent call to GetDocumentTextDetection.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsTextractMod.JobId] = js.undefined
}

object StartDocumentTextDetectionResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[StartDocumentTextDetectionResponse]
  }
}

