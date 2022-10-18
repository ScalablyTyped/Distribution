package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePricingPlanInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pricing plan you're deleting. 
    */
  var Arn: PricingPlanArn
}
object DeletePricingPlanInput {
  
  inline def apply(Arn: PricingPlanArn): DeletePricingPlanInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePricingPlanInput]
  }
  
  extension [Self <: DeletePricingPlanInput](x: Self) {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
