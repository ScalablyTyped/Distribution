package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetDetail extends StObject {
  
  /**
    * Name of the associated budget.
    */
  var BudgetName: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.BudgetName] = js.undefined
}
object BudgetDetail {
  
  inline def apply(): BudgetDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetDetail]
  }
  
  extension [Self <: BudgetDetail](x: Self) {
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setBudgetNameUndefined: Self = StObject.set(x, "BudgetName", js.undefined)
  }
}
