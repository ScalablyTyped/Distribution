package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetPerformanceHistoryResponse extends js.Object {
  /**
    * The history of how often the budget has gone into an ALARM state. For DAILY budgets, the history saves the state of the budget for the last 60 days. For MONTHLY budgets, the history saves the state of the budget for the current month plus the last 12 months. For QUARTERLY budgets, the history saves the state of the budget for the last four quarters.
    */
  var BudgetPerformanceHistory: js.UndefOr[typings.awsSdk.budgetsMod.BudgetPerformanceHistory] = js.native
  var NextToken: js.UndefOr[GenericString] = js.native
}

object DescribeBudgetPerformanceHistoryResponse {
  @scala.inline
  def apply(BudgetPerformanceHistory: BudgetPerformanceHistory = null, NextToken: GenericString = null): DescribeBudgetPerformanceHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (BudgetPerformanceHistory != null) __obj.updateDynamic("BudgetPerformanceHistory")(BudgetPerformanceHistory.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
  }
}

