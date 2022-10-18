package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCostCategoryDefinitionRequest extends StObject {
  
  var DefaultValue: js.UndefOr[CostCategoryValue] = js.undefined
  
  /**
    * The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future.
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined
  
  var Name: CostCategoryName
  
  /**
    * An optional list of tags to associate with the specified  CostCategory . You can use resource tags to control access to your cost category using IAM policies. Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions apply to resource tags:   Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource. The remaining are reserved for Amazon Web Services use   The maximum length of a key is 128 characters   The maximum length of a value is 256 characters   Keys and values can only contain alphanumeric characters, spaces, and any of the following: _.:/=+@-    Keys and values are case sensitive   Keys and values are trimmed for any leading or trailing whitespaces   Don’t use aws: as a prefix for your keys. This prefix is reserved for Amazon Web Services use  
    */
  var ResourceTags: js.UndefOr[ResourceTagList] = js.undefined
  
  var RuleVersion: CostCategoryRuleVersion
  
  /**
    * The Cost Category rules used to categorize costs. For more information, see CostCategoryRule.
    */
  var Rules: CostCategoryRulesList
  
  /**
    *  The split charge rules used to allocate your charges between your Cost Category values. 
    */
  var SplitChargeRules: js.UndefOr[CostCategorySplitChargeRulesList] = js.undefined
}
object CreateCostCategoryDefinitionRequest {
  
  inline def apply(Name: CostCategoryName, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): CreateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCostCategoryDefinitionRequest]
  }
  
  extension [Self <: CreateCostCategoryDefinitionRequest](x: Self) {
    
    inline def setDefaultValue(value: CostCategoryValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    inline def setEffectiveStartUndefined: Self = StObject.set(x, "EffectiveStart", js.undefined)
    
    inline def setName(value: CostCategoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceTags(value: ResourceTagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setRuleVersion(value: CostCategoryRuleVersion): Self = StObject.set(x, "RuleVersion", value.asInstanceOf[js.Any])
    
    inline def setRules(value: CostCategoryRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CostCategoryRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setSplitChargeRules(value: CostCategorySplitChargeRulesList): Self = StObject.set(x, "SplitChargeRules", value.asInstanceOf[js.Any])
    
    inline def setSplitChargeRulesUndefined: Self = StObject.set(x, "SplitChargeRules", js.undefined)
    
    inline def setSplitChargeRulesVarargs(value: CostCategorySplitChargeRule*): Self = StObject.set(x, "SplitChargeRules", js.Array(value*))
  }
}
