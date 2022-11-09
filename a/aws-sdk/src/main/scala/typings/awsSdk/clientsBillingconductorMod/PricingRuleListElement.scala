package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingRuleListElement extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) used to uniquely identify a pricing rule. 
    */
  var Arn: js.UndefOr[PricingRuleArn] = js.undefined
  
  /**
    *  The pricing plans count that this pricing rule is associated with. 
    */
  var AssociatedPricingPlanCount: js.UndefOr[NumberOfPricingPlansAssociatedWith] = js.undefined
  
  /**
    *  The time when the pricing rule was created. 
    */
  var CreationTime: js.UndefOr[Instant] = js.undefined
  
  /**
    *  The pricing rule description. 
    */
  var Description: js.UndefOr[PricingRuleDescription] = js.undefined
  
  /**
    *  The most recent time when the pricing rule was modified. 
    */
  var LastModifiedTime: js.UndefOr[Instant] = js.undefined
  
  /**
    *  A percentage modifier applied on the public pricing rates. 
    */
  var ModifierPercentage: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ModifierPercentage] = js.undefined
  
  /**
    *  The name of a pricing rule. 
    */
  var Name: js.UndefOr[PricingRuleName] = js.undefined
  
  /**
    *  The scope of pricing rule that indicates if it is globally applicable, or if it is service-specific. 
    */
  var Scope: js.UndefOr[PricingRuleScope] = js.undefined
  
  /**
    *  If the Scope attribute is SERVICE, this attribute indicates which service the PricingRule is applicable for. 
    */
  var Service: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.Service] = js.undefined
  
  /**
    *  The type of pricing rule. 
    */
  var Type: js.UndefOr[PricingRuleType] = js.undefined
}
object PricingRuleListElement {
  
  inline def apply(): PricingRuleListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingRuleListElement]
  }
  
  extension [Self <: PricingRuleListElement](x: Self) {
    
    inline def setArn(value: PricingRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssociatedPricingPlanCount(value: NumberOfPricingPlansAssociatedWith): Self = StObject.set(x, "AssociatedPricingPlanCount", value.asInstanceOf[js.Any])
    
    inline def setAssociatedPricingPlanCountUndefined: Self = StObject.set(x, "AssociatedPricingPlanCount", js.undefined)
    
    inline def setCreationTime(value: Instant): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: PricingRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: Instant): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModifierPercentage(value: ModifierPercentage): Self = StObject.set(x, "ModifierPercentage", value.asInstanceOf[js.Any])
    
    inline def setModifierPercentageUndefined: Self = StObject.set(x, "ModifierPercentage", js.undefined)
    
    inline def setName(value: PricingRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScope(value: PricingRuleScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    inline def setType(value: PricingRuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
