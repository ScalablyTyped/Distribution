package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePricingPlanOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the deleted pricing plan. 
    */
  var Arn: js.UndefOr[PricingPlanArn] = js.undefined
}
object DeletePricingPlanOutput {
  
  inline def apply(): DeletePricingPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePricingPlanOutput]
  }
  
  extension [Self <: DeletePricingPlanOutput](x: Self) {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
