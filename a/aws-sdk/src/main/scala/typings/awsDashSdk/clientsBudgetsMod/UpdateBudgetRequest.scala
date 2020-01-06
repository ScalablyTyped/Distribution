package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to update.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId = js.native
  /**
    * The budget that you want to update your budget to.
    */
  var NewBudget: Budget = js.native
}

object UpdateBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, NewBudget: Budget): UpdateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], NewBudget = NewBudget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateBudgetRequest]
  }
}

