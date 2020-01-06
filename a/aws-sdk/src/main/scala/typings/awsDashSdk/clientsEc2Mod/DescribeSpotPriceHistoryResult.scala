package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotPriceHistoryResult extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null or an empty string when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The historical Spot prices.
    */
  var SpotPriceHistory: js.UndefOr[SpotPriceHistoryList] = js.native
}

object DescribeSpotPriceHistoryResult {
  @scala.inline
  def apply(NextToken: String = null, SpotPriceHistory: SpotPriceHistoryList = null): DescribeSpotPriceHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SpotPriceHistory != null) __obj.updateDynamic("SpotPriceHistory")(SpotPriceHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpotPriceHistoryResult]
  }
}

