package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePolicyResponse extends js.Object {
  /**
    * Detailed information about the lifecycle policy.
    */
  var Policy: js.UndefOr[LifecyclePolicy] = js.native
}

object GetLifecyclePolicyResponse {
  @scala.inline
  def apply(Policy: LifecyclePolicy = null): GetLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyResponse]
  }
}

