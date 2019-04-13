package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLifecyclePolicyResponse extends js.Object {
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[PolicyId] = js.undefined
}

object CreateLifecyclePolicyResponse {
  @scala.inline
  def apply(PolicyId: PolicyId = null): CreateLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    __obj.asInstanceOf[CreateLifecyclePolicyResponse]
  }
}

