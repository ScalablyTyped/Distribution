package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociatePricingRulesInput extends StObject {
  
  /**
    *  The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from. 
    */
  var Arn: PricingPlanArn
  
  /**
    *  A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated. 
    */
  var PricingRuleArns: PricingRuleArnsNonEmptyInput
}
object DisassociatePricingRulesInput {
  
  inline def apply(Arn: PricingPlanArn, PricingRuleArns: PricingRuleArnsNonEmptyInput): DisassociatePricingRulesInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], PricingRuleArns = PricingRuleArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePricingRulesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociatePricingRulesInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArns(value: PricingRuleArnsNonEmptyInput): Self = StObject.set(x, "PricingRuleArns", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArnsVarargs(value: PricingRuleArn*): Self = StObject.set(x, "PricingRuleArns", js.Array(value*))
  }
}
