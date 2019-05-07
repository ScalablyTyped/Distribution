package typings
package awsDashSdkLib.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssumeRoleRequest
  extends awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions {
  /**
    * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see View the Maximum Session Duration Setting for a Role in the IAM User Guide. By default, the value is set to 3600 seconds.   The DurationSeconds parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a SessionDuration parameter that specifies the maximum length of the console session. For more information, see Creating a URL that Enables Federated Users to Access the AWS Management Console in the IAM User Guide. 
    */
  var DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined
  /**
    * A unique identifier that might be required when you assume a role in another account. If the administrator of the account to which the role belongs provided you with an external ID, then provide that value in the ExternalId parameter. This value can be any string, such as a passphrase or account number. Because a cross-account role is usually set up to trust everyone in an account, the administrator of the trusting account might send an external ID to the administrator of the trusted account. That way, only someone with the ID can assume the role, rather than everyone in the account. For more information about the external ID, see How to Use an External ID When Granting Access to Your AWS Resources to a Third Party in the IAM User Guide. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@:/-
    */
  var ExternalId: js.UndefOr[externalIdType] = js.undefined
  /**
    * An IAM policy in JSON format. This parameter is optional. If you pass a policy to this operation, the resulting temporary credentials have the permissions of the assumed role and the policy that you pass. This gives you a way to further restrict the permissions for the resulting temporary security credentials. You cannot use the passed policy to grant permissions that are in excess of those allowed by the permissions policy of the role that is being assumed. For more information, see  Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity  in the IAM User Guide. The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters in length. The characters can be any ASCII character from the space character to the end of the valid character list (\\u0020-\\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  The policy plaintext must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to the upper size limit the policy is, where 100 percent is the maximum allowed size. 
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the role to assume.
    */
  var RoleArn: arnType
  /**
    * An identifier for the assumed role session. Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the account that owns the role. The role session name is also used in the ARN of the assumed role principal. This means that subsequent cross-account API requests that use the temporary security credentials will expose the role session name to the external account in their AWS CloudTrail logs. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var RoleSessionName: roleSessionNameType
  /**
    * The identification number of the MFA device that is associated with the user who is making the AssumeRole call. Specify this value if the trust policy of the role being assumed includes a condition that requires MFA authentication. The value is either the serial number for a hardware device (such as GAHT12345678) or an Amazon Resource Name (ARN) for a virtual device (such as arn:aws:iam::123456789012:mfa/user). The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var SerialNumber: js.UndefOr[serialNumberType] = js.undefined
  /**
    * The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that is, if the policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the TokenCode value is missing or expired, the AssumeRole call returns an "access denied" error. The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
    */
  var TokenCode: js.UndefOr[tokenCodeType] = js.undefined
}

object AssumeRoleRequest {
  @scala.inline
  def apply(
    RoleArn: arnType,
    RoleSessionName: roleSessionNameType,
    DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
    ExternalId: externalIdType = null,
    Policy: sessionPolicyDocumentType = null,
    SerialNumber: serialNumberType = null,
    TokenCode: tokenCodeType = null
  ): AssumeRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn, RoleSessionName = RoleSessionName)
    if (!js.isUndefined(DurationSeconds)) __obj.updateDynamic("DurationSeconds")(DurationSeconds)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber)
    if (TokenCode != null) __obj.updateDynamic("TokenCode")(TokenCode)
    __obj.asInstanceOf[AssumeRoleRequest]
  }
}

