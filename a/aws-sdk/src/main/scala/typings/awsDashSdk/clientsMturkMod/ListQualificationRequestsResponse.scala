package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQualificationRequestsResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The number of Qualification requests on this page in the filtered results list, equivalent to the number of Qualification requests being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
  /**
    * The Qualification request. The response includes one QualificationRequest element for each Qualification request returned by the query.
    */
  var QualificationRequests: js.UndefOr[QualificationRequestList] = js.undefined
}

object ListQualificationRequestsResponse {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined,
    QualificationRequests: QualificationRequestList = null
  ): ListQualificationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults)
    if (QualificationRequests != null) __obj.updateDynamic("QualificationRequests")(QualificationRequests)
    __obj.asInstanceOf[ListQualificationRequestsResponse]
  }
}

