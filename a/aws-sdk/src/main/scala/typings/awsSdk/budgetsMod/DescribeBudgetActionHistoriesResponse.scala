package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetActionHistoriesResponse extends StObject {
  
  /**
    *  The historical record of the budget action resource. 
    */
  var ActionHistories: typings.awsSdk.budgetsMod.ActionHistories
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetActionHistoriesResponse {
  
  @scala.inline
  def apply(ActionHistories: ActionHistories): DescribeBudgetActionHistoriesResponse = {
    val __obj = js.Dynamic.literal(ActionHistories = ActionHistories.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionHistoriesResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionHistoriesResponseMutableBuilder[Self <: DescribeBudgetActionHistoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionHistories(value: ActionHistories): Self = StObject.set(x, "ActionHistories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionHistoriesVarargs(value: ActionHistory*): Self = StObject.set(x, "ActionHistories", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
