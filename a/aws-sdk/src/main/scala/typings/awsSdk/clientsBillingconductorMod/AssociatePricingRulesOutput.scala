package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePricingRulesOutput extends StObject {
  
  /**
    *  The PricingPlanArn that the PricingRuleArns are associated with. 
    */
  var Arn: js.UndefOr[PricingPlanArn] = js.undefined
}
object AssociatePricingRulesOutput {
  
  inline def apply(): AssociatePricingRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatePricingRulesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatePricingRulesOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
