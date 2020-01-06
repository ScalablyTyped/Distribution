package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetResponse extends js.Object {
  /**
    * The description of the budget.
    */
  var Budget: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.Budget] = js.native
}

object DescribeBudgetResponse {
  @scala.inline
  def apply(Budget: Budget = null): DescribeBudgetResponse = {
    val __obj = js.Dynamic.literal()
    if (Budget != null) __obj.updateDynamic("Budget")(Budget.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetResponse]
  }
}

