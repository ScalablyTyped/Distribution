package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetActionsForAccountRequest extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsBudgetsMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetActionsForAccountRequest {
  
  inline def apply(AccountId: AccountId): DescribeBudgetActionsForAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionsForAccountRequest]
  }
  
  extension [Self <: DescribeBudgetActionsForAccountRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
