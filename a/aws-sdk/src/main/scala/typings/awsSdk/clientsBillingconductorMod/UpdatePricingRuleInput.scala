package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePricingRuleInput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing rule to update. 
    */
  var Arn: PricingRuleArn
  
  /**
    *  The new description for the pricing rule. 
    */
  var Description: js.UndefOr[PricingRuleDescription] = js.undefined
  
  /**
    *  The new modifier to show pricing plan rates as a percentage. 
    */
  var ModifierPercentage: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ModifierPercentage] = js.undefined
  
  /**
    *  The new name of the pricing rule. The name must be unique to each pricing rule. 
    */
  var Name: js.UndefOr[PricingRuleName] = js.undefined
  
  /**
    *  The new pricing rule type. 
    */
  var Type: js.UndefOr[PricingRuleType] = js.undefined
}
object UpdatePricingRuleInput {
  
  inline def apply(Arn: PricingRuleArn): UpdatePricingRuleInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePricingRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePricingRuleInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PricingRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: PricingRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setModifierPercentage(value: ModifierPercentage): Self = StObject.set(x, "ModifierPercentage", value.asInstanceOf[js.Any])
    
    inline def setModifierPercentageUndefined: Self = StObject.set(x, "ModifierPercentage", js.undefined)
    
    inline def setName(value: PricingRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: PricingRuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
