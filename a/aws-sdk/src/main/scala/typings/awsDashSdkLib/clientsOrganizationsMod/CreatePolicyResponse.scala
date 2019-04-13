package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyResponse extends js.Object {
  /**
    * A structure that contains details about the newly created policy.
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

