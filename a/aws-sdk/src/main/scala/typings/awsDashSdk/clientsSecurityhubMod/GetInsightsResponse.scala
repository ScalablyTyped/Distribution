package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInsightsResponse extends js.Object {
  /**
    * The insights returned by the operation.
    */
  var Insights: InsightList
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.undefined
}

object GetInsightsResponse {
  @scala.inline
  def apply(Insights: InsightList, NextToken: NextToken = null): GetInsightsResponse = {
    val __obj = js.Dynamic.literal(Insights = Insights)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetInsightsResponse]
  }
}

