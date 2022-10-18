package typings.awsSdk.clientsStsMod

import typings.awsSdk.libCredentialsTemporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleRequest
  extends StObject
     with TemporaryCredentialsOptions {
  
  /**
    * The duration, in seconds, of the role session. The value specified can range from 900 seconds (15 minutes) up to the maximum session duration set for the role. The maximum session duration setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting or the administrator setting (whichever is lower), the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails.  Role chaining limits your Amazon Web Services CLI or Amazon Web Services API role session to a maximum of one hour. When you use the AssumeRole API operation to assume a role, you can specify the duration of your role session with the DurationSeconds parameter. You can specify a parameter value of up to 43200 seconds (12 hours), depending on the maximum session duration setting for your role. However, if you assume a role using role chaining and provide a DurationSeconds parameter value greater than one hour, the operation fails. To learn how to view the maximum value for your role, see View the Maximum Session Duration Setting for a Role in the IAM User Guide. By default, the value is set to 3600 seconds.   The DurationSeconds parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a SessionDuration parameter that specifies the maximum length of the console session. For more information, see Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console in the IAM User Guide. 
    */
  var DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined
  
  /**
    * A unique identifier that might be required when you assume a role in another account. If the administrator of the account to which the role belongs provided you with an external ID, then provide that value in the ExternalId parameter. This value can be any string, such as a passphrase or account number. A cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the trusting account might send an external ID to the administrator of the trusted account. That way, only someone with the ID can assume the role, rather than everyone in the account. For more information about the external ID, see How to Use an External ID When Granting Access to Your Amazon Web Services Resources to a Third Party in the IAM User Guide. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@:/-
    */
  var ExternalId: js.UndefOr[externalIdType] = js.undefined
  
  /**
    * An IAM policy in JSON format that you want to use as an inline session policy. This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide. The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.  
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role. This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services General Reference.  An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.   Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide.
    */
  var PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role to assume.
    */
  var RoleArn: arnType
  
  /**
    * An identifier for the assumed role session. Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the account that owns the role. The role session name is also used in the ARN of the assumed role principal. This means that subsequent cross-account API requests that use the temporary security credentials will expose the role session name to the external account in their CloudTrail logs. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var RoleSessionName: roleSessionNameType
  
  /**
    * The identification number of the MFA device that is associated with the user who is making the AssumeRole call. Specify this value if the trust policy of the role being assumed includes a condition that requires MFA authentication. The value is either the serial number for a hardware device (such as GAHT12345678) or an Amazon Resource Name (ARN) for a virtual device (such as arn:aws:iam::123456789012:mfa/user). The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var SerialNumber: js.UndefOr[serialNumberType] = js.undefined
  
  /**
    * The source identity specified by the principal that is calling the AssumeRole operation. You can require users to specify a source identity when they assume a role. You do this by using the sts:SourceIdentity condition key in a role trust policy. You can use source identity information in CloudTrail logs to determine who took actions with a role. You can use the aws:SourceIdentity condition key to further control access to Amazon Web Services resources based on the value of source identity. For more information about using source identity, see Monitor and control actions taken with assumed roles in the IAM User Guide. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-. You cannot use a value that begins with the text aws:. This prefix is reserved for Amazon Web Services internal use.
    */
  var SourceIdentity: js.UndefOr[sourceIdentityType] = js.undefined
  
  /**
    * A list of session tags that you want to pass. Each session tag consists of a key name and an associated value. For more information about session tags, see Tagging Amazon Web Services STS Sessions in the IAM User Guide. This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters, and the values can’t exceed 256 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.  An Amazon Web Services conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.   You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session tags override a role tag with the same key.  Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate Department and department tag keys. Assume that the role has the Department=Marketing tag and you pass the department=engineering session tag. Department and department are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag. Additionally, if you used temporary credentials to perform this operation, the new session inherits any transitive session tags from the calling session. If you pass a session tag with the same key as an inherited tag, the operation fails. To view the inherited tags for a session, see the CloudTrail logs. For more information, see Viewing Session Tags in CloudTrail in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  
  /**
    * The value provided by the MFA device, if the trust policy of the role being assumed requires MFA. (In other words, if the policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the TokenCode value is missing or expired, the AssumeRole call returns an "access denied" error. The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
    */
  var TokenCode: js.UndefOr[tokenCodeType] = js.undefined
  
  /**
    * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the corresponding key and value passes to subsequent sessions in a role chain. For more information, see Chaining Roles with Session Tags in the IAM User Guide. This parameter is optional. When you set session tags as transitive, the session policy and session tags packed binary limit is not affected. If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent sessions.
    */
  var TransitiveTagKeys: js.UndefOr[tagKeyListType] = js.undefined
}
object AssumeRoleRequest {
  
  inline def apply(RoleArn: arnType, RoleSessionName: roleSessionNameType): AssumeRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeRoleRequest]
  }
  
  extension [Self <: AssumeRoleRequest](x: Self) {
    
    inline def setDurationSeconds(value: roleDurationSecondsType): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setExternalId(value: externalIdType): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    inline def setPolicy(value: sessionPolicyDocumentType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArns(value: policyDescriptorListType): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
    
    inline def setPolicyArnsVarargs(value: PolicyDescriptorType*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setRoleArn(value: arnType): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleSessionName(value: roleSessionNameType): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setSourceIdentity(value: sourceIdentityType): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTokenCode(value: tokenCodeType): Self = StObject.set(x, "TokenCode", value.asInstanceOf[js.Any])
    
    inline def setTokenCodeUndefined: Self = StObject.set(x, "TokenCode", js.undefined)
    
    inline def setTransitiveTagKeys(value: tagKeyListType): Self = StObject.set(x, "TransitiveTagKeys", value.asInstanceOf[js.Any])
    
    inline def setTransitiveTagKeysUndefined: Self = StObject.set(x, "TransitiveTagKeys", js.undefined)
    
    inline def setTransitiveTagKeysVarargs(value: tagKeyType*): Self = StObject.set(x, "TransitiveTagKeys", js.Array(value*))
  }
}
