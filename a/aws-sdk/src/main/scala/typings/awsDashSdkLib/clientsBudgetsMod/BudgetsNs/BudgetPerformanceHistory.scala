package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BudgetPerformanceHistory extends js.Object {
  var BudgetName: js.UndefOr[BudgetName] = js.undefined
  var BudgetType: js.UndefOr[BudgetType] = js.undefined
  /**
       * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
       */
  var BudgetedAndActualAmountsList: js.UndefOr[BudgetedAndActualAmountsList] = js.undefined
  /**
       * The history of the cost filters for a budget during the specified time period.
       */
  var CostFilters: js.UndefOr[CostFilters] = js.undefined
  /**
       * The history of the cost types for a budget during the specified time period.
       */
  var CostTypes: js.UndefOr[CostTypes] = js.undefined
  var TimeUnit: js.UndefOr[TimeUnit] = js.undefined
}

