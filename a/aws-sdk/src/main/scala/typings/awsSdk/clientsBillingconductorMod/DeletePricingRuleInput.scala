package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePricingRuleInput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing rule that you are deleting. 
    */
  var Arn: PricingRuleArn
}
object DeletePricingRuleInput {
  
  inline def apply(Arn: PricingRuleArn): DeletePricingRuleInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePricingRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePricingRuleInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PricingRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
