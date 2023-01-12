package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  var Action: typings.awsSdk.clientsBudgetsMod.Action
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
}
object DeleteBudgetActionResponse {
  
  inline def apply(AccountId: AccountId, Action: Action, BudgetName: BudgetName): DeleteBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Action = Action.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBudgetActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBudgetActionResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
