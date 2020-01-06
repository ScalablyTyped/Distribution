package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightsRequest extends js.Object {
  /**
    * The ARNs of the insights that you want to describe.
    */
  var InsightArns: js.UndefOr[ArnList] = js.native
  /**
    * The maximum number of items that you want in the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.MaxResults] = js.native
  /**
    * Paginates results. On your first call to the GetInsights operation, set the value of this parameter to NULL. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.native
}

object GetInsightsRequest {
  @scala.inline
  def apply(InsightArns: ArnList = null, MaxResults: Int | scala.Double = null, NextToken: NextToken = null): GetInsightsRequest = {
    val __obj = js.Dynamic.literal()
    if (InsightArns != null) __obj.updateDynamic("InsightArns")(InsightArns.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightsRequest]
  }
}

