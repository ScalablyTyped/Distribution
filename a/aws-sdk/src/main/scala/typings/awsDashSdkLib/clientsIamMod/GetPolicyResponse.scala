package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyResponse extends js.Object {
  /**
    * A structure containing details about the policy.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
}

object GetPolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetPolicyResponse]
  }
}

