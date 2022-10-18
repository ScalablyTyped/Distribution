package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleWithSAMLRequest extends StObject {
  
  /**
    * The duration, in seconds, of the role session. Your role session lasts for the duration that you specify for the DurationSeconds parameter, or until the time specified in the SAML authentication response's SessionNotOnOrAfter value, whichever is shorter. You can provide a DurationSeconds value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see View the Maximum Session Duration Setting for a Role in the IAM User Guide. By default, the value is set to 3600 seconds.   The DurationSeconds parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a SessionDuration parameter that specifies the maximum length of the console session. For more information, see Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console in the IAM User Guide. 
    */
  var DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined
  
  /**
    * An IAM policy in JSON format that you want to use as an inline session policy. This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide.  The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.  
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role. This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services General Reference.  An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.   Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide.
    */
  var PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
    */
  var PrincipalArn: arnType
  
  /**
    * The Amazon Resource Name (ARN) of the role that the caller is assuming.
    */
  var RoleArn: arnType
  
  /**
    * The base64 encoded SAML authentication response provided by the IdP. For more information, see Configuring a Relying Party and Adding Claims in the IAM User Guide. 
    */
  var SAMLAssertion: SAMLAssertionType
}
object AssumeRoleWithSAMLRequest {
  
  inline def apply(PrincipalArn: arnType, RoleArn: arnType, SAMLAssertion: SAMLAssertionType): AssumeRoleWithSAMLRequest = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SAMLAssertion = SAMLAssertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeRoleWithSAMLRequest]
  }
  
  extension [Self <: AssumeRoleWithSAMLRequest](x: Self) {
    
    inline def setDurationSeconds(value: roleDurationSecondsType): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setPolicy(value: sessionPolicyDocumentType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArns(value: policyDescriptorListType): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
    
    inline def setPolicyArnsVarargs(value: PolicyDescriptorType*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setPrincipalArn(value: arnType): Self = StObject.set(x, "PrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: arnType): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSAMLAssertion(value: SAMLAssertionType): Self = StObject.set(x, "SAMLAssertion", value.asInstanceOf[js.Any])
  }
}
