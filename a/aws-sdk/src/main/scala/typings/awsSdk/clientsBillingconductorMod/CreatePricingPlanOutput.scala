package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePricingPlanOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created pricing plan.
    */
  var Arn: js.UndefOr[PricingPlanArn] = js.undefined
}
object CreatePricingPlanOutput {
  
  inline def apply(): CreatePricingPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePricingPlanOutput]
  }
  
  extension [Self <: CreatePricingPlanOutput](x: Self) {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
