package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputationPreference extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing plan used to compute the Amazon Web Services charges for a billing group. 
    */
  var PricingPlanArn: PricingPlanFullArn
}
object ComputationPreference {
  
  inline def apply(PricingPlanArn: PricingPlanFullArn): ComputationPreference = {
    val __obj = js.Dynamic.literal(PricingPlanArn = PricingPlanArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputationPreference]
  }
  
  extension [Self <: ComputationPreference](x: Self) {
    
    inline def setPricingPlanArn(value: PricingPlanFullArn): Self = StObject.set(x, "PricingPlanArn", value.asInstanceOf[js.Any])
  }
}
