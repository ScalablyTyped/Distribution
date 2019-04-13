package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBudgetResponse extends js.Object {
  /**
    * The description of the budget.
    */
  var Budget: js.UndefOr[Budget] = js.undefined
}

object DescribeBudgetResponse {
  @scala.inline
  def apply(Budget: Budget = null): DescribeBudgetResponse = {
    val __obj = js.Dynamic.literal()
    if (Budget != null) __obj.updateDynamic("Budget")(Budget)
    __obj.asInstanceOf[DescribeBudgetResponse]
  }
}

