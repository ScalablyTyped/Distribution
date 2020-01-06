package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDocumentTextDetectionResponse extends js.Object {
  /**
    * The identifier of the text detection job for the document. Use JobId to identify the job in a subsequent call to GetDocumentTextDetection. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsTextractMod.JobId] = js.native
}

object StartDocumentTextDetectionResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentTextDetectionResponse]
  }
}

