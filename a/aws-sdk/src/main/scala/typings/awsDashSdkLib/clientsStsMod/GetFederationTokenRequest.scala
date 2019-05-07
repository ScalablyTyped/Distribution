package typings
package awsDashSdkLib.clientsStsMod

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
    * An IAM policy in JSON format. You must pass an IAM permissions policy to GetFederationToken. When you pass a policy to this operation, the resulting temporary credentials are defined by the intersection of your IAM user policies and the policy that you pass. The passed policy defines the permissions of the federated user. AWS allows the federated user's request only when both the attached policy and the IAM user policy explicitly allow the federated user to perform the requested action. The passed policy cannot grant more permissions than those that are defined in the IAM user policy. The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters in length. The characters can be any ASCII character from the space character to the end of the valid character list (\\u0020-\\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  The policy plaintext must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to the upper size limit the policy is, where 100 percent is the maximum allowed size.  For more information about how permissions work, see Permissions for GetFederationToken.
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined
}

object GetFederationTokenRequest {
  @scala.inline
  def apply(
    Name: userNameType,
    DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined,
    Policy: sessionPolicyDocumentType = null
  ): GetFederationTokenRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(DurationSeconds)) __obj.updateDynamic("DurationSeconds")(DurationSeconds)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetFederationTokenRequest]
  }
}

