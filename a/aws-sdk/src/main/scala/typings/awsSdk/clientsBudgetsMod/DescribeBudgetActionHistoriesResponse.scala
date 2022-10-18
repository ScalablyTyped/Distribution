package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetActionHistoriesResponse extends StObject {
  
  /**
    *  The historical record of the budget action resource. 
    */
  var ActionHistories: typings.awsSdk.clientsBudgetsMod.ActionHistories
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetActionHistoriesResponse {
  
  inline def apply(ActionHistories: ActionHistories): DescribeBudgetActionHistoriesResponse = {
    val __obj = js.Dynamic.literal(ActionHistories = ActionHistories.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionHistoriesResponse]
  }
  
  extension [Self <: DescribeBudgetActionHistoriesResponse](x: Self) {
    
    inline def setActionHistories(value: ActionHistories): Self = StObject.set(x, "ActionHistories", value.asInstanceOf[js.Any])
    
    inline def setActionHistoriesVarargs(value: ActionHistory*): Self = StObject.set(x, "ActionHistories", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
