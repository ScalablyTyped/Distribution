package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to delete.
    */
  var AccountId: AccountId
  /**
    * The name of the budget that you want to delete.
    */
  var BudgetName: BudgetName
}

object DeleteBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DeleteBudgetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccountId")(AccountId)
    __obj.updateDynamic("BudgetName")(BudgetName)
    __obj.asInstanceOf[DeleteBudgetRequest]
  }
}

