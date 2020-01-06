package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePacksResponse extends js.Object {
  /**
    * Returns a list of ConformancePackDetail objects.
    */
  var ConformancePackDetails: js.UndefOr[ConformancePackDetailList] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.native
}

object DescribeConformancePacksResponse {
  @scala.inline
  def apply(ConformancePackDetails: ConformancePackDetailList = null, NextToken: NextToken = null): DescribeConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    if (ConformancePackDetails != null) __obj.updateDynamic("ConformancePackDetails")(ConformancePackDetails.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePacksResponse]
  }
}

