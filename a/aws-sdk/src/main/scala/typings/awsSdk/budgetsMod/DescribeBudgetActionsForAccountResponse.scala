package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetActionsForAccountResponse extends StObject {
  
  /**
    *  A list of the budget action resources information. 
    */
  var Actions: typings.awsSdk.budgetsMod.Actions = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeBudgetActionsForAccountResponse {
  
  @scala.inline
  def apply(Actions: Actions): DescribeBudgetActionsForAccountResponse = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionsForAccountResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionsForAccountResponseMutableBuilder[Self <: DescribeBudgetActionsForAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
