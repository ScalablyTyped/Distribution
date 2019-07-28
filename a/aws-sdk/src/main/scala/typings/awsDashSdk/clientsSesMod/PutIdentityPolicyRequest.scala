package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutIdentityPolicyRequest extends js.Object {
  /**
    * The identity that the policy will apply to. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
    */
  var Identity: typings.awsDashSdk.clientsSesMod.Identity
  /**
    * The text of the policy in JSON format. The policy cannot exceed 4 KB. For information about the syntax of sending authorization policies, see the Amazon SES Developer Guide. 
    */
  var Policy: typings.awsDashSdk.clientsSesMod.Policy
  /**
    * The name of the policy. The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and underscores.
    */
  var PolicyName: typings.awsDashSdk.clientsSesMod.PolicyName
}

object PutIdentityPolicyRequest {
  @scala.inline
  def apply(Identity: Identity, Policy: Policy, PolicyName: PolicyName): PutIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity, Policy = Policy, PolicyName = PolicyName)
  
    __obj.asInstanceOf[PutIdentityPolicyRequest]
  }
}

