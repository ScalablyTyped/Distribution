package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociatePricingRulesOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing plan that the pricing rules successfully disassociated from. 
    */
  var Arn: js.UndefOr[PricingPlanArn] = js.undefined
}
object DisassociatePricingRulesOutput {
  
  inline def apply(): DisassociatePricingRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociatePricingRulesOutput]
  }
  
  extension [Self <: DisassociatePricingRulesOutput](x: Self) {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
