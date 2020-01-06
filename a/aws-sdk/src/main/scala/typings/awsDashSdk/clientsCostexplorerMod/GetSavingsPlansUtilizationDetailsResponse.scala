package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansUtilizationDetailsResponse extends js.Object {
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  /**
    * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
    */
  var SavingsPlansUtilizationDetails: typings.awsDashSdk.clientsCostexplorerMod.SavingsPlansUtilizationDetails = js.native
  var TimePeriod: DateInterval = js.native
  /**
    * The total Savings Plans utilization, regardless of time period.
    */
  var Total: js.UndefOr[SavingsPlansUtilizationAggregates] = js.native
}

object GetSavingsPlansUtilizationDetailsResponse {
  @scala.inline
  def apply(
    SavingsPlansUtilizationDetails: SavingsPlansUtilizationDetails,
    TimePeriod: DateInterval,
    NextToken: NextPageToken = null,
    Total: SavingsPlansUtilizationAggregates = null
  ): GetSavingsPlansUtilizationDetailsResponse = {
    val __obj = js.Dynamic.literal(SavingsPlansUtilizationDetails = SavingsPlansUtilizationDetails.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationDetailsResponse]
  }
}

