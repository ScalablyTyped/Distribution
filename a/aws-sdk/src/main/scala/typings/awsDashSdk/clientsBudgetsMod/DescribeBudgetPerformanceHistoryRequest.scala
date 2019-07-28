package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId
  var BudgetName: typings.awsDashSdk.clientsBudgetsMod.BudgetName
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.MaxResults] = js.undefined
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * Retrieves how often the budget went into an ALARM state for the specified time period.
    */
  var TimePeriod: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.TimePeriod] = js.undefined
}

object DescribeBudgetPerformanceHistoryRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: GenericString = null,
    TimePeriod: TimePeriod = null
  ): DescribeBudgetPerformanceHistoryRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod)
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
  }
}

