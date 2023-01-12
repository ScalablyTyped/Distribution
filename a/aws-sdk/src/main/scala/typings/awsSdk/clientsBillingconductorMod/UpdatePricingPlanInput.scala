package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePricingPlanInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pricing plan that you're updating. 
    */
  var Arn: PricingPlanArn
  
  /**
    * The description of the pricing plan. 
    */
  var Description: js.UndefOr[PricingPlanDescription] = js.undefined
  
  /**
    * The name of the pricing plan. The name must be unique to each pricing plan. 
    */
  var Name: js.UndefOr[PricingPlanName] = js.undefined
}
object UpdatePricingPlanInput {
  
  inline def apply(Arn: PricingPlanArn): UpdatePricingPlanInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePricingPlanInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePricingPlanInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: PricingPlanDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: PricingPlanName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
