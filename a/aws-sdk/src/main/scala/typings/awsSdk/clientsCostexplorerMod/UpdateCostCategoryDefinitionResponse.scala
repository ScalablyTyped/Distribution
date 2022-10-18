package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCostCategoryDefinitionResponse extends StObject {
  
  /**
    * The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Cost Category's effective start date. It can only be a billing start date (first day of the month).
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined
}
object UpdateCostCategoryDefinitionResponse {
  
  inline def apply(): UpdateCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCostCategoryDefinitionResponse]
  }
  
  extension [Self <: UpdateCostCategoryDefinitionResponse](x: Self) {
    
    inline def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryArnUndefined: Self = StObject.set(x, "CostCategoryArn", js.undefined)
    
    inline def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    inline def setEffectiveStartUndefined: Self = StObject.set(x, "EffectiveStart", js.undefined)
  }
}
