package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetsResponse extends StObject {
  
  /**
    * A list of budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.budgetsMod.Budgets] = js.native
  
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeBudgetsResponse {
  
  @scala.inline
  def apply(): DescribeBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetsResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetsResponseMutableBuilder[Self <: DescribeBudgetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
