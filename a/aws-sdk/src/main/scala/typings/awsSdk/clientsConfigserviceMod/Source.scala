package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to CUSTOM_POLICY.
    */
  var CustomPolicyDetails: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.CustomPolicyDetails] = js.undefined
  
  /**
    * Indicates whether Amazon Web Services or the customer owns and manages the Config rule. Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see Config Managed Rules in the Config developer guide. Config Custom Rules are rules that you can develop either with Guard (CUSTOM_POLICY) or Lambda (CUSTOM_LAMBDA). For more information, see Config Custom Rules  in the Config developer guide.
    */
  var Owner: typings.awsSdk.clientsConfigserviceMod.Owner
  
  /**
    * Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources against a rule. It also provides the frequency with which you want Config to run evaluations for the rule if the trigger type is periodic. If the owner is set to CUSTOM_POLICY, the only acceptable values for the Config rule trigger message type are ConfigurationItemChangeNotification and OversizedConfigurationItemChangeNotification.
    */
  var SourceDetails: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.SourceDetails] = js.undefined
  
  /**
    * For Config Managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see List of Config Managed Rules. For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda function, such as arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name. For Config Custom Policy rules, this field will be ignored.
    */
  var SourceIdentifier: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object Source {
  
  inline def apply(Owner: Owner): Source = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setCustomPolicyDetails(value: CustomPolicyDetails): Self = StObject.set(x, "CustomPolicyDetails", value.asInstanceOf[js.Any])
    
    inline def setCustomPolicyDetailsUndefined: Self = StObject.set(x, "CustomPolicyDetails", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setSourceDetails(value: SourceDetails): Self = StObject.set(x, "SourceDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceDetailsUndefined: Self = StObject.set(x, "SourceDetails", js.undefined)
    
    inline def setSourceDetailsVarargs(value: SourceDetail*): Self = StObject.set(x, "SourceDetails", js.Array(value*))
    
    inline def setSourceIdentifier(value: StringWithCharLimit256): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentifierUndefined: Self = StObject.set(x, "SourceIdentifier", js.undefined)
  }
}
