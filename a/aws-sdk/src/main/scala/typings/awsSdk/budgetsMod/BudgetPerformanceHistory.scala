package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetPerformanceHistory extends js.Object {
  var BudgetName: js.UndefOr[typings.awsSdk.budgetsMod.BudgetName] = js.native
  var BudgetType: js.UndefOr[typings.awsSdk.budgetsMod.BudgetType] = js.native
  /**
    * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
    */
  var BudgetedAndActualAmountsList: js.UndefOr[typings.awsSdk.budgetsMod.BudgetedAndActualAmountsList] = js.native
  /**
    * The history of the cost filters for a budget during the specified time period.
    */
  var CostFilters: js.UndefOr[typings.awsSdk.budgetsMod.CostFilters] = js.native
  /**
    * The history of the cost types for a budget during the specified time period.
    */
  var CostTypes: js.UndefOr[typings.awsSdk.budgetsMod.CostTypes] = js.native
  var TimeUnit: js.UndefOr[typings.awsSdk.budgetsMod.TimeUnit] = js.native
}

object BudgetPerformanceHistory {
  @scala.inline
  def apply(): BudgetPerformanceHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetPerformanceHistory]
  }
  @scala.inline
  implicit class BudgetPerformanceHistoryOps[Self <: BudgetPerformanceHistory] (val x: Self) extends AnyVal {
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
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudgetName: Self = this.set("BudgetName", js.undefined)
    @scala.inline
    def setBudgetType(value: BudgetType): Self = this.set("BudgetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudgetType: Self = this.set("BudgetType", js.undefined)
    @scala.inline
    def setBudgetedAndActualAmountsListVarargs(value: BudgetedAndActualAmounts*): Self = this.set("BudgetedAndActualAmountsList", js.Array(value :_*))
    @scala.inline
    def setBudgetedAndActualAmountsList(value: BudgetedAndActualAmountsList): Self = this.set("BudgetedAndActualAmountsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudgetedAndActualAmountsList: Self = this.set("BudgetedAndActualAmountsList", js.undefined)
    @scala.inline
    def setCostFilters(value: CostFilters): Self = this.set("CostFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCostFilters: Self = this.set("CostFilters", js.undefined)
    @scala.inline
    def setCostTypes(value: CostTypes): Self = this.set("CostTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCostTypes: Self = this.set("CostTypes", js.undefined)
    @scala.inline
    def setTimeUnit(value: TimeUnit): Self = this.set("TimeUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeUnit: Self = this.set("TimeUnit", js.undefined)
  }
  
}

