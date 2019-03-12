package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to delete.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.AccountId
  /**
    * The name of the budget that you want to delete.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.BudgetName
}

object DeleteBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DeleteBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName)
  
    __obj.asInstanceOf[DeleteBudgetRequest]
  }
}

