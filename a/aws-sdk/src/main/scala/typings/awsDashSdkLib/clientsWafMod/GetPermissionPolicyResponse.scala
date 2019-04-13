package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPermissionPolicyResponse extends js.Object {
  /**
    * The IAM policy attached to the specified RuleGroup.
    */
  var Policy: js.UndefOr[PolicyString] = js.undefined
}

object GetPermissionPolicyResponse {
  @scala.inline
  def apply(Policy: PolicyString = null): GetPermissionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetPermissionPolicyResponse]
  }
}

