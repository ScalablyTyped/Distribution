package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateBudgetFromResourceInput extends StObject {
  
  /**
    * The name of the budget you want to disassociate.
    */
  var BudgetName: typings.awsSdk.clientsServicecatalogMod.BudgetName
  
  /**
    * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
    */
  var ResourceId: Id
}
object DisassociateBudgetFromResourceInput {
  
  inline def apply(BudgetName: BudgetName, ResourceId: Id): DisassociateBudgetFromResourceInput = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateBudgetFromResourceInput]
  }
  
  extension [Self <: DisassociateBudgetFromResourceInput](x: Self) {
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: Id): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
