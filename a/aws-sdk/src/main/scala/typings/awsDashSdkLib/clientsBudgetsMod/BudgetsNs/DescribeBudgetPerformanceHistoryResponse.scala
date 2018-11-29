package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DescribeBudgetPerformanceHistoryResponse extends js.Object {
  /**
       * The history of how often the budget has gone into an ALARM state. For DAILY budgets, the history saves the state of the budget for the last 60 days. For MONTHLY budgets, the history saves the state of the budget for the current month plus the last 12 months. For QUARTERLY budgets, the history saves the state of the budget for the last four quarters.
       */
  var BudgetPerformanceHistory: js.UndefOr[BudgetPerformanceHistory] = js.undefined
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

