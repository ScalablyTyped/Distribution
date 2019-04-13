package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyResponse extends js.Object {
  /**
    * Information about the specified AWS Firewall Manager policy.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
}

object GetPolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null, PolicyArn: ResourceArn = null): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn)
    __obj.asInstanceOf[GetPolicyResponse]
  }
}

