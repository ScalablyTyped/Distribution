package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want a description of.
    */
  var AccountId: AccountId
  /**
    * The name of the budget that you want a description of.
    */
  var BudgetName: BudgetName
}

object DescribeBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccountId")(AccountId)
    __obj.updateDynamic("BudgetName")(BudgetName)
    __obj.asInstanceOf[DescribeBudgetRequest]
  }
}

