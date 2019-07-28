package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetPerformanceHistory extends js.Object {
  var BudgetName: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.BudgetName] = js.undefined
  var BudgetType: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.BudgetType] = js.undefined
  /**
    * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
    */
  var BudgetedAndActualAmountsList: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.BudgetedAndActualAmountsList] = js.undefined
  /**
    * The history of the cost filters for a budget during the specified time period.
    */
  var CostFilters: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.CostFilters] = js.undefined
  /**
    * The history of the cost types for a budget during the specified time period.
    */
  var CostTypes: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.CostTypes] = js.undefined
  var TimeUnit: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.TimeUnit] = js.undefined
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
    if (BudgetName != null) __obj.updateDynamic("BudgetName")(BudgetName)
    if (BudgetType != null) __obj.updateDynamic("BudgetType")(BudgetType.asInstanceOf[js.Any])
    if (BudgetedAndActualAmountsList != null) __obj.updateDynamic("BudgetedAndActualAmountsList")(BudgetedAndActualAmountsList)
    if (CostFilters != null) __obj.updateDynamic("CostFilters")(CostFilters)
    if (CostTypes != null) __obj.updateDynamic("CostTypes")(CostTypes)
    if (TimeUnit != null) __obj.updateDynamic("TimeUnit")(TimeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetPerformanceHistory]
  }
}

