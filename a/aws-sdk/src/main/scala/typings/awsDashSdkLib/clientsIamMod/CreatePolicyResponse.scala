package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyResponse extends js.Object {
  /**
    * A structure containing details about the new policy.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
}

object CreatePolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[CreatePolicyResponse]
  }
}

