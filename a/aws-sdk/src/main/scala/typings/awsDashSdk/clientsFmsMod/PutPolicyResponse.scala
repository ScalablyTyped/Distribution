package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPolicyResponse extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy that was created.
    */
  var Policy: js.UndefOr[typings.awsDashSdk.clientsFmsMod.Policy] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy that was created.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.native
}

object PutPolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null, PolicyArn: ResourceArn = null): PutPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyResponse]
  }
}

