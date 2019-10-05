package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFederationTokenRequest extends js.Object {
  /**
    * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions obtained using AWS account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root user credentials defaults to one hour.
    */
  var DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined
  /**
    * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as Bob). For example, you can reference the federated user name in a resource-based policy, such as in an Amazon S3 bucket policy. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var Name: userNameType
  /**
    * An IAM policy in JSON format that you want to use as an inline session policy. You must pass an inline or managed session policy to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies. This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions. The only exception is when the credentials are used to access a resource that has a resource-based policy that specifically references the federated user session in the Principal element of the policy. When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see Session Policies in the IAM User Guide. The plain text that you use for both inline and managed session policies shouldn't exceed 2048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  The characters in this parameter count towards the 2048 character session policy guideline. However, an AWS conversion compresses the session policies into a packed binary format that has a separate limit. This is the enforced limit. The PackedPolicySize response element indicates by percentage how close the policy is to the upper size limit. 
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy. The policies must exist in the same account as the IAM user that is requesting federated access. You must pass an inline or managed session policy to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use for both inline and managed session policies shouldn't exceed 2048 characters. You can provide up to 10 managed policy ARNs. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference. This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions. The only exception is when the credentials are used to access a resource that has a resource-based policy that specifically references the federated user session in the Principal element of the policy. When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see Session Policies in the IAM User Guide.  The characters in this parameter count towards the 2048 character session policy guideline. However, an AWS conversion compresses the session policies into a packed binary format that has a separate limit. This is the enforced limit. The PackedPolicySize response element indicates by percentage how close the policy is to the upper size limit. 
    */
  var PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined
}

object GetFederationTokenRequest {
  @scala.inline
  def apply(
    Name: userNameType,
    DurationSeconds: Int | Double = null,
    Policy: sessionPolicyDocumentType = null,
    PolicyArns: policyDescriptorListType = null
  ): GetFederationTokenRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (DurationSeconds != null) __obj.updateDynamic("DurationSeconds")(DurationSeconds.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (PolicyArns != null) __obj.updateDynamic("PolicyArns")(PolicyArns)
    __obj.asInstanceOf[GetFederationTokenRequest]
  }
}

