package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBudgetRequest extends js.Object {
  
  /**
    * The accountId that is associated with the budget that you want to update.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
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
  
  @scala.inline
  implicit class UpdateBudgetRequestOps[Self <: UpdateBudgetRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewBudget(value: Budget): Self = this.set("NewBudget", value.asInstanceOf[js.Any])
  }
}
