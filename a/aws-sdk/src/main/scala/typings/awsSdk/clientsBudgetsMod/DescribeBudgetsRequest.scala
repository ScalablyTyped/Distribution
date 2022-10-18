package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetsRequest extends StObject {
  
  /**
    * The accountId that is associated with the budgets that you want descriptions of.
    */
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsBudgetsMod.MaxResults] = js.undefined
  
  /**
    * The pagination token that you include in your request to indicate the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetsRequest {
  
  inline def apply(AccountId: AccountId): DescribeBudgetsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetsRequest]
  }
  
  extension [Self <: DescribeBudgetsRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
