package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePricingRuleOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the deleted pricing rule. 
    */
  var Arn: js.UndefOr[PricingRuleArn] = js.undefined
}
object DeletePricingRuleOutput {
  
  inline def apply(): DeletePricingRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePricingRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePricingRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PricingRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
