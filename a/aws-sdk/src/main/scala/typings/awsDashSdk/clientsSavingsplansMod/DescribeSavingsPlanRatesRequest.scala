package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlanRatesRequest extends js.Object {
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanRateFilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: SavingsPlanId = js.native
}

object DescribeSavingsPlanRatesRequest {
  @scala.inline
  def apply(
    savingsPlanId: SavingsPlanId,
    filters: SavingsPlanRateFilterList = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null
  ): DescribeSavingsPlanRatesRequest = {
    val __obj = js.Dynamic.literal(savingsPlanId = savingsPlanId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlanRatesRequest]
  }
}

