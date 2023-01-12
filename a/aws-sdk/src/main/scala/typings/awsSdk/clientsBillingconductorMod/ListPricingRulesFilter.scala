package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricingRulesFilter extends StObject {
  
  /**
    *  A list containing the pricing rule Amazon Resource Names (ARNs) to include in the API response. 
    */
  var Arns: js.UndefOr[PricingRuleArns] = js.undefined
}
object ListPricingRulesFilter {
  
  inline def apply(): ListPricingRulesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricingRulesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPricingRulesFilter] (val x: Self) extends AnyVal {
    
    inline def setArns(value: PricingRuleArns): Self = StObject.set(x, "Arns", value.asInstanceOf[js.Any])
    
    inline def setArnsUndefined: Self = StObject.set(x, "Arns", js.undefined)
    
    inline def setArnsVarargs(value: PricingRuleArn*): Self = StObject.set(x, "Arns", js.Array(value*))
  }
}
