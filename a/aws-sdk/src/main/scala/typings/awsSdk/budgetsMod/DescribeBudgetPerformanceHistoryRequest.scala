package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetPerformanceHistoryRequest extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  
  var MaxResults: js.UndefOr[typings.awsSdk.budgetsMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * Retrieves how often the budget went into an ALARM state for the specified time period.
    */
  var TimePeriod: js.UndefOr[typings.awsSdk.budgetsMod.TimePeriod] = js.native
}
object DescribeBudgetPerformanceHistoryRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetPerformanceHistoryRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
  }
  
  @scala.inline
  implicit class DescribeBudgetPerformanceHistoryRequestMutableBuilder[Self <: DescribeBudgetPerformanceHistoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: TimePeriod): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
