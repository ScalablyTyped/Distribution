package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to update.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.AccountId
  /**
    * The budget that you want to update your budget to.
    */
  var NewBudget: Budget
}

object UpdateBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, NewBudget: Budget): UpdateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, NewBudget = NewBudget)
  
    __obj.asInstanceOf[UpdateBudgetRequest]
  }
}

