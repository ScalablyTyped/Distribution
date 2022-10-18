package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePricingRulesInput extends StObject {
  
  /**
    *  The PricingPlanArn that the PricingRuleArns are associated with. 
    */
  var Arn: PricingPlanArn
  
  /**
    *  The PricingRuleArns that are associated with the Pricing Plan. 
    */
  var PricingRuleArns: PricingRuleArnsNonEmptyInput
}
object AssociatePricingRulesInput {
  
  inline def apply(Arn: PricingPlanArn, PricingRuleArns: PricingRuleArnsNonEmptyInput): AssociatePricingRulesInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], PricingRuleArns = PricingRuleArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePricingRulesInput]
  }
  
  extension [Self <: AssociatePricingRulesInput](x: Self) {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArns(value: PricingRuleArnsNonEmptyInput): Self = StObject.set(x, "PricingRuleArns", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArnsVarargs(value: PricingRuleArn*): Self = StObject.set(x, "PricingRuleArns", js.Array(value*))
  }
}
