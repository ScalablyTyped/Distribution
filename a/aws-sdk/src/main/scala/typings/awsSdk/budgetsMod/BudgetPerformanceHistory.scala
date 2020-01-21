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
  def apply(
    BudgetName: BudgetName = null,
    BudgetType: BudgetType = null,
    BudgetedAndActualAmountsList: BudgetedAndActualAmountsList = null,
    CostFilters: CostFilters = null,
    CostTypes: CostTypes = null,
    TimeUnit: TimeUnit = null
  ): BudgetPerformanceHistory = {
    val __obj = js.Dynamic.literal()
    if (BudgetName != null) __obj.updateDynamic("BudgetName")(BudgetName.asInstanceOf[js.Any])
    if (BudgetType != null) __obj.updateDynamic("BudgetType")(BudgetType.asInstanceOf[js.Any])
    if (BudgetedAndActualAmountsList != null) __obj.updateDynamic("BudgetedAndActualAmountsList")(BudgetedAndActualAmountsList.asInstanceOf[js.Any])
    if (CostFilters != null) __obj.updateDynamic("CostFilters")(CostFilters.asInstanceOf[js.Any])
    if (CostTypes != null) __obj.updateDynamic("CostTypes")(CostTypes.asInstanceOf[js.Any])
    if (TimeUnit != null) __obj.updateDynamic("TimeUnit")(TimeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetPerformanceHistory]
  }
}

