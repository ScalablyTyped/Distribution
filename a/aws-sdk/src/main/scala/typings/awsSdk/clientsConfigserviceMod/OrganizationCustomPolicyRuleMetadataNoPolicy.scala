package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationCustomPolicyRuleMetadataNoPolicy extends StObject {
  
  /**
    * A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List is null when debug logging is enabled for all accounts.
    */
  var DebugLogDeliveryAccounts: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.DebugLogDeliveryAccounts] = js.undefined
  
  /**
    * The description that you provide for your organization Config Custom Policy rule.
    */
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.undefined
  
  /**
    * A string, in JSON format, that is passed to your organization Config Custom Policy rule.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.undefined
  
  /**
    * The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is triggered when Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.MaximumExecutionFrequency] = js.undefined
  
  /**
    * The type of notification that triggers Config to run an evaluation for a rule. For Config Custom Policy rules, Config supports change triggered notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when Config delivers an oversized configuration item. Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.  
    */
  var OrganizationConfigRuleTriggerTypes: js.UndefOr[OrganizationConfigRuleTriggerTypeNoSNs] = js.undefined
  
  /**
    * The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the Guard GitHub Repository.
    */
  var PolicyRuntime: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.PolicyRuntime] = js.undefined
  
  /**
    * The ID of the Amazon Web Services resource that was evaluated.
    */
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.undefined
  
  /**
    * The type of the Amazon Web Services resource that was evaluated.
    */
  var ResourceTypesScope: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceTypesScope] = js.undefined
  
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values.
    */
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.undefined
  
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
    */
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object OrganizationCustomPolicyRuleMetadataNoPolicy {
  
  inline def apply(): OrganizationCustomPolicyRuleMetadataNoPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationCustomPolicyRuleMetadataNoPolicy]
  }
  
  extension [Self <: OrganizationCustomPolicyRuleMetadataNoPolicy](x: Self) {
    
    inline def setDebugLogDeliveryAccounts(value: DebugLogDeliveryAccounts): Self = StObject.set(x, "DebugLogDeliveryAccounts", value.asInstanceOf[js.Any])
    
    inline def setDebugLogDeliveryAccountsUndefined: Self = StObject.set(x, "DebugLogDeliveryAccounts", js.undefined)
    
    inline def setDebugLogDeliveryAccountsVarargs(value: AccountId*): Self = StObject.set(x, "DebugLogDeliveryAccounts", js.Array(value*))
    
    inline def setDescription(value: StringWithCharLimit256Min0): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInputParameters(value: StringWithCharLimit2048): Self = StObject.set(x, "InputParameters", value.asInstanceOf[js.Any])
    
    inline def setInputParametersUndefined: Self = StObject.set(x, "InputParameters", js.undefined)
    
    inline def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    inline def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "MaximumExecutionFrequency", js.undefined)
    
    inline def setOrganizationConfigRuleTriggerTypes(value: OrganizationConfigRuleTriggerTypeNoSNs): Self = StObject.set(x, "OrganizationConfigRuleTriggerTypes", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigRuleTriggerTypesUndefined: Self = StObject.set(x, "OrganizationConfigRuleTriggerTypes", js.undefined)
    
    inline def setOrganizationConfigRuleTriggerTypesVarargs(value: OrganizationConfigRuleTriggerTypeNoSN*): Self = StObject.set(x, "OrganizationConfigRuleTriggerTypes", js.Array(value*))
    
    inline def setPolicyRuntime(value: PolicyRuntime): Self = StObject.set(x, "PolicyRuntime", value.asInstanceOf[js.Any])
    
    inline def setPolicyRuntimeUndefined: Self = StObject.set(x, "PolicyRuntime", js.undefined)
    
    inline def setResourceIdScope(value: StringWithCharLimit768): Self = StObject.set(x, "ResourceIdScope", value.asInstanceOf[js.Any])
    
    inline def setResourceIdScopeUndefined: Self = StObject.set(x, "ResourceIdScope", js.undefined)
    
    inline def setResourceTypesScope(value: ResourceTypesScope): Self = StObject.set(x, "ResourceTypesScope", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesScopeUndefined: Self = StObject.set(x, "ResourceTypesScope", js.undefined)
    
    inline def setResourceTypesScopeVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ResourceTypesScope", js.Array(value*))
    
    inline def setTagKeyScope(value: StringWithCharLimit128): Self = StObject.set(x, "TagKeyScope", value.asInstanceOf[js.Any])
    
    inline def setTagKeyScopeUndefined: Self = StObject.set(x, "TagKeyScope", js.undefined)
    
    inline def setTagValueScope(value: StringWithCharLimit256): Self = StObject.set(x, "TagValueScope", value.asInstanceOf[js.Any])
    
    inline def setTagValueScopeUndefined: Self = StObject.set(x, "TagValueScope", js.undefined)
  }
}
