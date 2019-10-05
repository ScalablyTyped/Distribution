package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentAnalysisRequest extends js.Object {
  /**
    * A unique identifier for the text-detection job. The JobId is returned from StartDocumentAnalysis.
    */
  var JobId: typings.awsDashSdk.clientsTextractMod.JobId
  /**
    * The maximum number of results to return per paginated call. The largest value that you can specify is 1,000. If you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsTextractMod.MaxResults] = js.undefined
  /**
    * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object GetDocumentAnalysisRequest {
  @scala.inline
  def apply(JobId: JobId, MaxResults: Int | Double = null, NextToken: PaginationToken = null): GetDocumentAnalysisRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetDocumentAnalysisRequest]
  }
}

