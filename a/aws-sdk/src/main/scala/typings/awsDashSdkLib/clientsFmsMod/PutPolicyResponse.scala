package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPolicyResponse extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy that was created.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the policy that was created.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
}

object PutPolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null, PolicyArn: ResourceArn = null): PutPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn)
    __obj.asInstanceOf[PutPolicyResponse]
  }
}

