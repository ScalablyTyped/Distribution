package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    *  A budget action resource. 
    */
  var Action: typings.awsSdk.clientsBudgetsMod.Action
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
}
object DescribeBudgetActionResponse {
  
  inline def apply(AccountId: AccountId, Action: Action, BudgetName: BudgetName): DescribeBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Action = Action.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionResponse]
  }
  
  extension [Self <: DescribeBudgetActionResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
