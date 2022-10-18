package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetPerformanceHistoryRequest extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsBudgetsMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Retrieves how often the budget went into an ALARM state for the specified time period.
    */
  var TimePeriod: js.UndefOr[typings.awsSdk.clientsBudgetsMod.TimePeriod] = js.undefined
}
object DescribeBudgetPerformanceHistoryRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetPerformanceHistoryRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
  }
  
  extension [Self <: DescribeBudgetPerformanceHistoryRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTimePeriod(value: TimePeriod): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
