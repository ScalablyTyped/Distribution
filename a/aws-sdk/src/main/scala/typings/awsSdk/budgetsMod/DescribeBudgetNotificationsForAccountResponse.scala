package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetNotificationsForAccountResponse extends StObject {
  
  /**
    *  A list of budget names and associated notifications for an account. 
    */
  var BudgetNotificationsForAccount: js.UndefOr[BudgetNotificationsForAccountList] = js.undefined
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetNotificationsForAccountResponse {
  
  inline def apply(): DescribeBudgetNotificationsForAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetNotificationsForAccountResponse]
  }
  
  extension [Self <: DescribeBudgetNotificationsForAccountResponse](x: Self) {
    
    inline def setBudgetNotificationsForAccount(value: BudgetNotificationsForAccountList): Self = StObject.set(x, "BudgetNotificationsForAccount", value.asInstanceOf[js.Any])
    
    inline def setBudgetNotificationsForAccountUndefined: Self = StObject.set(x, "BudgetNotificationsForAccount", js.undefined)
    
    inline def setBudgetNotificationsForAccountVarargs(value: BudgetNotificationsForAccount*): Self = StObject.set(x, "BudgetNotificationsForAccount", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
