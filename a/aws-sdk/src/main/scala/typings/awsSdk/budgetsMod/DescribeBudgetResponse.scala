package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetResponse extends StObject {
  
  /**
    * The description of the budget.
    */
  var Budget: js.UndefOr[typings.awsSdk.budgetsMod.Budget] = js.native
}
object DescribeBudgetResponse {
  
  @scala.inline
  def apply(): DescribeBudgetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetResponseMutableBuilder[Self <: DescribeBudgetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudget(value: Budget): Self = StObject.set(x, "Budget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetUndefined: Self = StObject.set(x, "Budget", js.undefined)
  }
}
