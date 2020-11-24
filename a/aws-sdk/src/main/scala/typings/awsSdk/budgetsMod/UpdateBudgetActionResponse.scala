package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBudgetActionResponse extends js.Object {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  
  /**
    *  The updated action resource information. 
    */
  var NewAction: Action = js.native
  
  /**
    *  The previous action resource information. 
    */
  var OldAction: Action = js.native
}
object UpdateBudgetActionResponse {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, NewAction: Action, OldAction: Action): UpdateBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewAction = NewAction.asInstanceOf[js.Any], OldAction = OldAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBudgetActionResponse]
  }
  
  @scala.inline
  implicit class UpdateBudgetActionResponseOps[Self <: UpdateBudgetActionResponse] (val x: Self) extends AnyVal {
    
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
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewAction(value: Action): Self = this.set("NewAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldAction(value: Action): Self = this.set("OldAction", value.asInstanceOf[js.Any])
  }
}
