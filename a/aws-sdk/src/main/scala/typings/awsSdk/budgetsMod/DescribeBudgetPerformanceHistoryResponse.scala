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
  def apply(): DescribeBudgetPerformanceHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
  }
  @scala.inline
  implicit class DescribeBudgetPerformanceHistoryResponseOps[Self <: DescribeBudgetPerformanceHistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBudgetPerformanceHistory(value: BudgetPerformanceHistory): Self = this.set("BudgetPerformanceHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudgetPerformanceHistory: Self = this.set("BudgetPerformanceHistory", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

