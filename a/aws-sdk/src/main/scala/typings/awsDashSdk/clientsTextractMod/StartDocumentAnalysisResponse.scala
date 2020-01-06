package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDocumentAnalysisResponse extends js.Object {
  /**
    * The identifier for the document text detection job. Use JobId to identify the job in a subsequent call to GetDocumentAnalysis. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsTextractMod.JobId] = js.native
}

object StartDocumentAnalysisResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartDocumentAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentAnalysisResponse]
  }
}

