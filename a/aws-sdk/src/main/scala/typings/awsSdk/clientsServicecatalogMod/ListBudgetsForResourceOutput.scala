package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBudgetsForResourceOutput extends StObject {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Budgets] = js.undefined
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
}
object ListBudgetsForResourceOutput {
  
  inline def apply(): ListBudgetsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBudgetsForResourceOutput]
  }
  
  extension [Self <: ListBudgetsForResourceOutput](x: Self) {
    
    inline def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value*))
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
