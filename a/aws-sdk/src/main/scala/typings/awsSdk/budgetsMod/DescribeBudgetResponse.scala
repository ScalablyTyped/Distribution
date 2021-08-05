package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetResponse extends StObject {
  
  /**
    * The description of the budget.
    */
  var Budget: js.UndefOr[typings.awsSdk.budgetsMod.Budget] = js.undefined
}
object DescribeBudgetResponse {
  
  inline def apply(): DescribeBudgetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetResponse]
  }
  
  extension [Self <: DescribeBudgetResponse](x: Self) {
    
    inline def setBudget(value: Budget): Self = StObject.set(x, "Budget", value.asInstanceOf[js.Any])
    
    inline def setBudgetUndefined: Self = StObject.set(x, "Budget", js.undefined)
  }
}
