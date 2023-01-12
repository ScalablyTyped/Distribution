package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePricingRuleOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the created pricing rule. 
    */
  var Arn: js.UndefOr[PricingRuleArn] = js.undefined
}
object CreatePricingRuleOutput {
  
  inline def apply(): CreatePricingRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePricingRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePricingRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PricingRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
