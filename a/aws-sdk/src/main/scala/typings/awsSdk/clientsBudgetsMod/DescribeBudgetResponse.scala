package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetResponse extends StObject {
  
  /**
    * The description of the budget.
    */
  var Budget: js.UndefOr[typings.awsSdk.clientsBudgetsMod.Budget] = js.undefined
}
object DescribeBudgetResponse {
  
  inline def apply(): DescribeBudgetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBudgetResponse] (val x: Self) extends AnyVal {
    
    inline def setBudget(value: Budget): Self = StObject.set(x, "Budget", value.asInstanceOf[js.Any])
    
    inline def setBudgetUndefined: Self = StObject.set(x, "Budget", js.undefined)
  }
}
