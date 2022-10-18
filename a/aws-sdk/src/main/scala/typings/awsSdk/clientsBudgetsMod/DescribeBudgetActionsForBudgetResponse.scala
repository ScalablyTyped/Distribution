package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetActionsForBudgetResponse extends StObject {
  
  /**
    *  A list of the budget action resources information. 
    */
  var Actions: typings.awsSdk.clientsBudgetsMod.Actions
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetActionsForBudgetResponse {
  
  inline def apply(Actions: Actions): DescribeBudgetActionsForBudgetResponse = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionsForBudgetResponse]
  }
  
  extension [Self <: DescribeBudgetActionsForBudgetResponse](x: Self) {
    
    inline def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
