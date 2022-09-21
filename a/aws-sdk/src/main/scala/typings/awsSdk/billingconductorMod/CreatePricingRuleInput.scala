package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePricingRuleInput extends StObject {
  
  /**
    *  The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented in a future update. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.billingconductorMod.ClientToken] = js.undefined
  
  /**
    *  The pricing rule description. 
    */
  var Description: js.UndefOr[PricingRuleDescription] = js.undefined
  
  /**
    *  A percentage modifier applied on the public pricing rates. 
    */
  var ModifierPercentage: typings.awsSdk.billingconductorMod.ModifierPercentage
  
  /**
    *  The pricing rule name. The names must be unique to each pricing rule. 
    */
  var Name: PricingRuleName
  
  /**
    *  The scope of pricing rule that indicates if it is globally applicable, or is service-specific. 
    */
  var Scope: PricingRuleScope
  
  /**
    *  If the Scope attribute is set to SERVICE, the attribute indicates which service the PricingRule is applicable for. 
    */
  var Service: js.UndefOr[typings.awsSdk.billingconductorMod.Service] = js.undefined
  
  /**
    *  A map that contains tag keys and tag values that are attached to a pricing rule. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The type of pricing rule. 
    */
  var Type: PricingRuleType
}
object CreatePricingRuleInput {
  
  inline def apply(
    ModifierPercentage: ModifierPercentage,
    Name: PricingRuleName,
    Scope: PricingRuleScope,
    Type: PricingRuleType
  ): CreatePricingRuleInput = {
    val __obj = js.Dynamic.literal(ModifierPercentage = ModifierPercentage.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePricingRuleInput]
  }
  
  extension [Self <: CreatePricingRuleInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: PricingRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setModifierPercentage(value: ModifierPercentage): Self = StObject.set(x, "ModifierPercentage", value.asInstanceOf[js.Any])
    
    inline def setName(value: PricingRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: PricingRuleScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: PricingRuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
