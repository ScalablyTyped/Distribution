package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansCoverageResponse extends js.Object {
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  /**
    * The amount of spend that your Savings Plans covered.
    */
  var SavingsPlansCoverages: typings.awsDashSdk.clientsCostexplorerMod.SavingsPlansCoverages = js.native
}

object GetSavingsPlansCoverageResponse {
  @scala.inline
  def apply(SavingsPlansCoverages: SavingsPlansCoverages, NextToken: NextPageToken = null): GetSavingsPlansCoverageResponse = {
    val __obj = js.Dynamic.literal(SavingsPlansCoverages = SavingsPlansCoverages.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansCoverageResponse]
  }
}

