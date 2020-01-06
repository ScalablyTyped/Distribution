package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAggregationAuthorizationsResponse extends js.Object {
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeAggregationAuthorizationsResponse {
  @scala.inline
  def apply(AggregationAuthorizations: AggregationAuthorizationList = null, NextToken: String = null): DescribeAggregationAuthorizationsResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregationAuthorizations != null) __obj.updateDynamic("AggregationAuthorizations")(AggregationAuthorizations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAggregationAuthorizationsResponse]
  }
}

