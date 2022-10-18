package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCostCategoryDefinitionRequest extends StObject {
  
  /**
    * The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn
}
object DeleteCostCategoryDefinitionRequest {
  
  inline def apply(CostCategoryArn: Arn): DeleteCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCostCategoryDefinitionRequest]
  }
  
  extension [Self <: DeleteCostCategoryDefinitionRequest](x: Self) {
    
    inline def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
  }
}
