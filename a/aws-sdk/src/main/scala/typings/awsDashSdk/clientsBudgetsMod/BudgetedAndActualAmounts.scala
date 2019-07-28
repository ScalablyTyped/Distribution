package typings.awsDashSdk.clientsBudgetsMod

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
  var TimePeriod: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.TimePeriod] = js.undefined
}

object BudgetedAndActualAmounts {
  @scala.inline
  def apply(ActualAmount: Spend = null, BudgetedAmount: Spend = null, TimePeriod: TimePeriod = null): BudgetedAndActualAmounts = {
    val __obj = js.Dynamic.literal()
    if (ActualAmount != null) __obj.updateDynamic("ActualAmount")(ActualAmount)
    if (BudgetedAmount != null) __obj.updateDynamic("BudgetedAmount")(BudgetedAmount)
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod)
    __obj.asInstanceOf[BudgetedAndActualAmounts]
  }
}

