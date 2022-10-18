package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePricingPlanInput extends StObject {
  
  /**
    *  The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented in a future update. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ClientToken] = js.undefined
  
  /**
    * The pricing plan description. 
    */
  var Description: js.UndefOr[PricingPlanDescription] = js.undefined
  
  /**
    * The pricing plan name. The names must be unique to each pricing plan. 
    */
  var Name: PricingPlanName
  
  /**
    *  A list of Amazon Resource Names (ARNs) that define the pricing plan parameters. 
    */
  var PricingRuleArns: js.UndefOr[PricingRuleArnsInput] = js.undefined
  
  /**
    *  A map that contains tag keys and tag values that are attached to a pricing plan. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreatePricingPlanInput {
  
  inline def apply(Name: PricingPlanName): CreatePricingPlanInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePricingPlanInput]
  }
  
  extension [Self <: CreatePricingPlanInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: PricingPlanDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: PricingPlanName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArns(value: PricingRuleArnsInput): Self = StObject.set(x, "PricingRuleArns", value.asInstanceOf[js.Any])
    
    inline def setPricingRuleArnsUndefined: Self = StObject.set(x, "PricingRuleArns", js.undefined)
    
    inline def setPricingRuleArnsVarargs(value: PricingRuleArn*): Self = StObject.set(x, "PricingRuleArns", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
