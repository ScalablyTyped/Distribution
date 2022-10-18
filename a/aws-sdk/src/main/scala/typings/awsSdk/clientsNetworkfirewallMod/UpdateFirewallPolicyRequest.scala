package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallPolicyRequest extends StObject {
  
  /**
    * A description of the firewall policy.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Description] = js.undefined
  
  /**
    * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the request.  If set to TRUE, Network Firewall checks whether the request can run successfully, but doesn't actually make the requested changes. The call returns the value that the request would return if you ran it with dry run set to FALSE, but doesn't make additions or changes to your resources. This option allows you to make sure that you have the required permissions to run the request and that your request parameters are valid.  If set to FALSE, Network Firewall makes the requested changes to your resources. 
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A complex type that contains settings for encryption of your firewall policy resources.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The updated firewall policy to use for the firewall. 
    */
  var FirewallPolicy: typings.awsSdk.clientsNetworkfirewallMod.FirewallPolicy
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall policy. The token marks the state of the policy resource at the time of the request.  To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall policy again to get a current copy of it with current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.clientsNetworkfirewallMod.UpdateToken
}
object UpdateFirewallPolicyRequest {
  
  inline def apply(FirewallPolicy: FirewallPolicy, UpdateToken: UpdateToken): UpdateFirewallPolicyRequest = {
    val __obj = js.Dynamic.literal(FirewallPolicy = FirewallPolicy.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFirewallPolicyRequest]
  }
  
  extension [Self <: UpdateFirewallPolicyRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setFirewallPolicy(value: FirewallPolicy): Self = StObject.set(x, "FirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyArnUndefined: Self = StObject.set(x, "FirewallPolicyArn", js.undefined)
    
    inline def setFirewallPolicyName(value: ResourceName): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyNameUndefined: Self = StObject.set(x, "FirewallPolicyName", js.undefined)
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
