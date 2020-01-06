package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansRequest extends js.Object {
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanFilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The Amazon Resource Names (ARN) of the Savings Plans.
    */
  var savingsPlanArns: js.UndefOr[SavingsPlanArnList] = js.native
  /**
    * The IDs of the Savings Plans.
    */
  var savingsPlanIds: js.UndefOr[SavingsPlanIdList] = js.native
  /**
    * The states.
    */
  var states: js.UndefOr[SavingsPlanStateList] = js.native
}

object DescribeSavingsPlansRequest {
  @scala.inline
  def apply(
    filters: SavingsPlanFilterList = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null,
    savingsPlanArns: SavingsPlanArnList = null,
    savingsPlanIds: SavingsPlanIdList = null,
    states: SavingsPlanStateList = null
  ): DescribeSavingsPlansRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (savingsPlanArns != null) __obj.updateDynamic("savingsPlanArns")(savingsPlanArns.asInstanceOf[js.Any])
    if (savingsPlanIds != null) __obj.updateDynamic("savingsPlanIds")(savingsPlanIds.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlansRequest]
  }
}

