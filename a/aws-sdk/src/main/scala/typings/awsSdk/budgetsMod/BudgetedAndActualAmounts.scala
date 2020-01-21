package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetedAndActualAmounts extends js.Object {
  /**
    * Your actual costs or usage for a budget period.
    */
  var ActualAmount: js.UndefOr[Spend] = js.native
  /**
    * The amount of cost or usage that you created the budget for.
    */
  var BudgetedAmount: js.UndefOr[Spend] = js.native
  /**
    * The time period covered by this budget comparison.
    */
  var TimePeriod: js.UndefOr[typings.awsSdk.budgetsMod.TimePeriod] = js.native
}

object BudgetedAndActualAmounts {
  @scala.inline
  def apply(ActualAmount: Spend = null, BudgetedAmount: Spend = null, TimePeriod: TimePeriod = null): BudgetedAndActualAmounts = {
    val __obj = js.Dynamic.literal()
    if (ActualAmount != null) __obj.updateDynamic("ActualAmount")(ActualAmount.asInstanceOf[js.Any])
    if (BudgetedAmount != null) __obj.updateDynamic("BudgetedAmount")(BudgetedAmount.asInstanceOf[js.Any])
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetedAndActualAmounts]
  }
}

