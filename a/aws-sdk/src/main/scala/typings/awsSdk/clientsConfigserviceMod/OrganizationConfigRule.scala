package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConfigRule extends StObject {
  
  /**
    * A comma-separated list of accounts excluded from organization Config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ExcludedAccounts] = js.undefined
  
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of organization Config rule.
    */
  var OrganizationConfigRuleArn: StringWithCharLimit256
  
  /**
    * The name that you assign to organization Config rule.
    */
  var OrganizationConfigRuleName: typings.awsSdk.clientsConfigserviceMod.OrganizationConfigRuleName
  
  /**
    * An object that specifies metadata for your organization's Config Custom Policy rule. The metadata includes the runtime system in use, which accounts have debug logging enabled, and other custom rule metadata, such as resource type, resource ID of Amazon Web Services resource, and organization trigger types that initiate Config to evaluate Amazon Web Services resources against a rule.
    */
  var OrganizationCustomPolicyRuleMetadata: js.UndefOr[OrganizationCustomPolicyRuleMetadataNoPolicy] = js.undefined
  
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationCustomRuleMetadata] = js.undefined
  
  /**
    * An OrganizationManagedRuleMetadata object.
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationManagedRuleMetadata] = js.undefined
}
object OrganizationConfigRule {
  
  inline def apply(
    OrganizationConfigRuleArn: StringWithCharLimit256,
    OrganizationConfigRuleName: OrganizationConfigRuleName
  ): OrganizationConfigRule = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleArn = OrganizationConfigRuleArn.asInstanceOf[js.Any], OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfigRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationConfigRule] (val x: Self) extends AnyVal {
    
    inline def setExcludedAccounts(value: ExcludedAccounts): Self = StObject.set(x, "ExcludedAccounts", value.asInstanceOf[js.Any])
    
    inline def setExcludedAccountsUndefined: Self = StObject.set(x, "ExcludedAccounts", js.undefined)
    
    inline def setExcludedAccountsVarargs(value: AccountId*): Self = StObject.set(x, "ExcludedAccounts", js.Array(value*))
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConfigRuleArn", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomPolicyRuleMetadata(value: OrganizationCustomPolicyRuleMetadataNoPolicy): Self = StObject.set(x, "OrganizationCustomPolicyRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomPolicyRuleMetadataUndefined: Self = StObject.set(x, "OrganizationCustomPolicyRuleMetadata", js.undefined)
    
    inline def setOrganizationCustomRuleMetadata(value: OrganizationCustomRuleMetadata): Self = StObject.set(x, "OrganizationCustomRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomRuleMetadataUndefined: Self = StObject.set(x, "OrganizationCustomRuleMetadata", js.undefined)
    
    inline def setOrganizationManagedRuleMetadata(value: OrganizationManagedRuleMetadata): Self = StObject.set(x, "OrganizationManagedRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationManagedRuleMetadataUndefined: Self = StObject.set(x, "OrganizationManagedRuleMetadata", js.undefined)
  }
}
