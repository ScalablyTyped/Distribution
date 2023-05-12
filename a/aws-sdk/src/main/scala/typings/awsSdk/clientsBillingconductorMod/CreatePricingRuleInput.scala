package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePricingRuleInput extends StObject {
  
  /**
    *  The seller of services provided by Amazon Web Services, their affiliates, or third-party providers selling services via Amazon Web Services Marketplace. 
    */
  var BillingEntity: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.BillingEntity] = js.undefined
  
  /**
    *  The token that's needed to support idempotency. Idempotency isn't currently supported, but will be implemented in a future update. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ClientToken] = js.undefined
  
  /**
    *  The pricing rule description. 
    */
  var Description: js.UndefOr[PricingRuleDescription] = js.undefined
  
  /**
    *  A percentage modifier that's applied on the public pricing rates. 
    */
  var ModifierPercentage: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ModifierPercentage] = js.undefined
  
  /**
    *  The pricing rule name. The names must be unique to each pricing rule. 
    */
  var Name: PricingRuleName
  
  /**
    *  Operation is the specific Amazon Web Services action covered by this line item. This describes the specific usage of the line item.  If the Scope attribute is set to SKU, this attribute indicates which operation the PricingRule is modifying. For example, a value of RunInstances:0202 indicates the operation of running an Amazon EC2 instance.
    */
  var Operation: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.Operation] = js.undefined
  
  /**
    *  The scope of pricing rule that indicates if it's globally applicable, or it's service-specific. 
    */
  var Scope: PricingRuleScope
  
  /**
    *  If the Scope attribute is set to SERVICE or SKU, the attribute indicates which service the PricingRule is applicable for. 
    */
  var Service: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.Service] = js.undefined
  
  /**
    *  A map that contains tag keys and tag values that are attached to a pricing rule. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The set of tiering configurations for the pricing rule. 
    */
  var Tiering: js.UndefOr[CreateTieringInput] = js.undefined
  
  /**
    *  The type of pricing rule. 
    */
  var Type: PricingRuleType
  
  /**
    *  Usage type is the unit that each service uses to measure the usage of a specific type of resource. If the Scope attribute is set to SKU, this attribute indicates which usage type the PricingRule is modifying. For example, USW2-BoxUsage:m2.2xlarge describes an M2 High Memory Double Extra Large instance in the US West (Oregon) Region. &lt;/p&gt; 
    */
  var UsageType: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.UsageType] = js.undefined
}
object CreatePricingRuleInput {
  
  inline def apply(Name: PricingRuleName, Scope: PricingRuleScope, Type: PricingRuleType): CreatePricingRuleInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePricingRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePricingRuleInput] (val x: Self) extends AnyVal {
    
    inline def setBillingEntity(value: BillingEntity): Self = StObject.set(x, "BillingEntity", value.asInstanceOf[js.Any])
    
    inline def setBillingEntityUndefined: Self = StObject.set(x, "BillingEntity", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: PricingRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setModifierPercentage(value: ModifierPercentage): Self = StObject.set(x, "ModifierPercentage", value.asInstanceOf[js.Any])
    
    inline def setModifierPercentageUndefined: Self = StObject.set(x, "ModifierPercentage", js.undefined)
    
    inline def setName(value: PricingRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    inline def setScope(value: PricingRuleScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTiering(value: CreateTieringInput): Self = StObject.set(x, "Tiering", value.asInstanceOf[js.Any])
    
    inline def setTieringUndefined: Self = StObject.set(x, "Tiering", js.undefined)
    
    inline def setType(value: PricingRuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUsageType(value: UsageType): Self = StObject.set(x, "UsageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "UsageType", js.undefined)
  }
}
