package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOrganizationConfigRuleRequest extends StObject {
  
  /**
    * A comma-separated list of accounts that you want to exclude from an organization Config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ExcludedAccounts] = js.undefined
  
  /**
    * The name that you assign to an organization Config rule.
    */
  var OrganizationConfigRuleName: typings.awsSdk.clientsConfigserviceMod.OrganizationConfigRuleName
  
  /**
    * An OrganizationCustomPolicyRuleMetadata object. This object specifies metadata for your organization's Config Custom Policy rule. The metadata includes the runtime system in use, which accounts have debug logging enabled, and other custom rule metadata, such as resource type, resource ID of Amazon Web Services resource, and organization trigger types that initiate Config to evaluate Amazon Web Services resources against a rule.
    */
  var OrganizationCustomPolicyRuleMetadata: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationCustomPolicyRuleMetadata] = js.undefined
  
  /**
    * An OrganizationCustomRuleMetadata object. This object specifies organization custom rule metadata such as resource type, resource ID of Amazon Web Services resource, Lambda function ARN, and organization trigger types that trigger Config to evaluate your Amazon Web Services resources against a rule. It also provides the frequency with which you want Config to run evaluations for the rule if the trigger type is periodic.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationCustomRuleMetadata] = js.undefined
  
  /**
    * An OrganizationManagedRuleMetadata object. This object specifies organization managed rule metadata such as resource type and ID of Amazon Web Services resource along with the rule identifier. It also provides the frequency with which you want Config to run evaluations for the rule if the trigger type is periodic.
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationManagedRuleMetadata] = js.undefined
}
object PutOrganizationConfigRuleRequest {
  
  inline def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): PutOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConfigRuleRequest]
  }
  
  extension [Self <: PutOrganizationConfigRuleRequest](x: Self) {
    
    inline def setExcludedAccounts(value: ExcludedAccounts): Self = StObject.set(x, "ExcludedAccounts", value.asInstanceOf[js.Any])
    
    inline def setExcludedAccountsUndefined: Self = StObject.set(x, "ExcludedAccounts", js.undefined)
    
    inline def setExcludedAccountsVarargs(value: AccountId*): Self = StObject.set(x, "ExcludedAccounts", js.Array(value*))
    
    inline def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomPolicyRuleMetadata(value: OrganizationCustomPolicyRuleMetadata): Self = StObject.set(x, "OrganizationCustomPolicyRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomPolicyRuleMetadataUndefined: Self = StObject.set(x, "OrganizationCustomPolicyRuleMetadata", js.undefined)
    
    inline def setOrganizationCustomRuleMetadata(value: OrganizationCustomRuleMetadata): Self = StObject.set(x, "OrganizationCustomRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomRuleMetadataUndefined: Self = StObject.set(x, "OrganizationCustomRuleMetadata", js.undefined)
    
    inline def setOrganizationManagedRuleMetadata(value: OrganizationManagedRuleMetadata): Self = StObject.set(x, "OrganizationManagedRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationManagedRuleMetadataUndefined: Self = StObject.set(x, "OrganizationManagedRuleMetadata", js.undefined)
  }
}
