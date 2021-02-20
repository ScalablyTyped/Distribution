package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    *  A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typings.awsSdk.budgetsMod.ActionId = js.native
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  
  /**
    *  The type of execution. 
    */
  var ExecutionType: typings.awsSdk.budgetsMod.ExecutionType = js.native
}
object ExecuteBudgetActionResponse {
  
  @scala.inline
  def apply(AccountId: AccountId, ActionId: ActionId, BudgetName: BudgetName, ExecutionType: ExecutionType): ExecuteBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ActionId = ActionId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteBudgetActionResponse]
  }
  
  @scala.inline
  implicit class ExecuteBudgetActionResponseMutableBuilder[Self <: ExecuteBudgetActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionId(value: ActionId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionType(value: ExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
  }
}
