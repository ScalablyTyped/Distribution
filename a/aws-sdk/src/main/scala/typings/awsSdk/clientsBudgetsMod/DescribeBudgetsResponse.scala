package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetsResponse extends StObject {
  
  /**
    * A list of budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.clientsBudgetsMod.Budgets] = js.undefined
  
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetsResponse {
  
  inline def apply(): DescribeBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetsResponse]
  }
  
  extension [Self <: DescribeBudgetsResponse](x: Self) {
    
    inline def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
