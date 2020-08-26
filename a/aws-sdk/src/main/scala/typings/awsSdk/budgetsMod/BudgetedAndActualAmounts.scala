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
  def apply(): BudgetedAndActualAmounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetedAndActualAmounts]
  }
  @scala.inline
  implicit class BudgetedAndActualAmountsOps[Self <: BudgetedAndActualAmounts] (val x: Self) extends AnyVal {
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
    def setActualAmount(value: Spend): Self = this.set("ActualAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualAmount: Self = this.set("ActualAmount", js.undefined)
    @scala.inline
    def setBudgetedAmount(value: Spend): Self = this.set("BudgetedAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudgetedAmount: Self = this.set("BudgetedAmount", js.undefined)
    @scala.inline
    def setTimePeriod(value: TimePeriod): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("TimePeriod", js.undefined)
  }
  
}

