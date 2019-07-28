package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePolicyResponse extends js.Object {
  /**
    * A structure that contains details about the updated policy, showing the requested changes.
    */
  var Policy: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Policy] = js.undefined
}

object UpdatePolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): UpdatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[UpdatePolicyResponse]
  }
}

