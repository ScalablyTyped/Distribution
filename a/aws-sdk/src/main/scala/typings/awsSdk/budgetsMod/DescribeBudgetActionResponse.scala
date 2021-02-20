package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    *  A budget action resource. 
    */
  var Action: typings.awsSdk.budgetsMod.Action = js.native
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
}
object DescribeBudgetActionResponse {
  
  @scala.inline
  def apply(AccountId: AccountId, Action: Action, BudgetName: BudgetName): DescribeBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Action = Action.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionResponseMutableBuilder[Self <: DescribeBudgetActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
