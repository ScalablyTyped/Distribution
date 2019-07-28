package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDocumentAnalysisResponse extends js.Object {
  /**
    * The identifier for the document text detection job. Use JobId to identify the job in a subsequent call to GetDocumentAnalysis.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsTextractMod.JobId] = js.undefined
}

object StartDocumentAnalysisResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartDocumentAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[StartDocumentAnalysisResponse]
  }
}

