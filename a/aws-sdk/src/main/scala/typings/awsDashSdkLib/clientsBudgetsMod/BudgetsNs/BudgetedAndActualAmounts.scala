package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BudgetedAndActualAmounts extends js.Object {
  /**
       * Your actual costs or usage for a budget period.
       */
  var ActualAmount: js.UndefOr[Spend] = js.undefined
  /**
       * The amount of cost or usage that you created the budget for.
       */
  var BudgetedAmount: js.UndefOr[Spend] = js.undefined
  /**
       * The time period covered by this budget comparison.
       */
  var TimePeriod: js.UndefOr[TimePeriod] = js.undefined
}

