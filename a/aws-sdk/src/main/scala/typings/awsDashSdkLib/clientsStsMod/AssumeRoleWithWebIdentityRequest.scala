package typings
package awsDashSdkLib.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssumeRoleWithWebIdentityRequest
  extends awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityCredentialsInputs {
  /**
    * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see View the Maximum Session Duration Setting for a Role in the IAM User Guide. By default, the value is set to 3600 seconds.   The DurationSeconds parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a SessionDuration parameter that specifies the maximum length of the console session. For more information, see Creating a URL that Enables Federated Users to Access the AWS Management Console in the IAM User Guide. 
    */
  var DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined
  /**
    * An IAM policy in JSON format that you want to use as an inline session policy. This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide. The plain text that you use for both inline and managed session policies shouldn't exceed 2048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  The characters in this parameter count towards the 2048 character session policy guideline. However, an AWS conversion compresses the session policies into a packed binary format that has a separate limit. This is the enforced limit. The PackedPolicySize response element indicates by percentage how close the policy is to the upper size limit. 
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role. This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you use for both inline and managed session policies shouldn't exceed 2048 characters. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.  The characters in this parameter count towards the 2048 character session policy guideline. However, an AWS conversion compresses the session policies into a packed binary format that has a separate limit. This is the enforced limit. The PackedPolicySize response element indicates by percentage how close the policy is to the upper size limit.  Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide.
    */
  var PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined
  /**
    * The fully qualified host component of the domain name of the identity provider. Specify this value only for OAuth 2.0 access tokens. Currently www.amazon.com and graph.facebook.com are the only supported identity providers for OAuth 2.0 access tokens. Do not include URL schemes and port numbers. Do not specify this value for OpenID Connect ID tokens.
    */
  var ProviderId: js.UndefOr[urlType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the role that the caller is assuming.
    */
  var RoleArn: arnType
  /**
    * An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with the user who is using your application. That way, the temporary security credentials that your application will use are associated with that user. This session name is included as part of the ARN and assumed role ID in the AssumedRoleUser response element. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var RoleSessionName: roleSessionNameType
  /**
    * The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application must get this token by authenticating the user who is using your application with a web identity provider before the application makes an AssumeRoleWithWebIdentity call. 
    */
  var WebIdentityToken: clientTokenType
}

object AssumeRoleWithWebIdentityRequest {
  @scala.inline
  def apply(
    RoleArn: arnType,
    RoleSessionName: roleSessionNameType,
    WebIdentityToken: clientTokenType,
    DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
    Policy: sessionPolicyDocumentType = null,
    PolicyArns: policyDescriptorListType = null,
    ProviderId: urlType = null
  ): AssumeRoleWithWebIdentityRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn, RoleSessionName = RoleSessionName, WebIdentityToken = WebIdentityToken)
    if (!js.isUndefined(DurationSeconds)) __obj.updateDynamic("DurationSeconds")(DurationSeconds)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (PolicyArns != null) __obj.updateDynamic("PolicyArns")(PolicyArns)
    if (ProviderId != null) __obj.updateDynamic("ProviderId")(ProviderId)
    __obj.asInstanceOf[AssumeRoleWithWebIdentityRequest]
  }
}

