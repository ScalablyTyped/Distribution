package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLifecyclePolicyRequest extends js.Object {
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsDashSdk.clientsDlmMod.PolicyId
}

object GetLifecyclePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): GetLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
  
    __obj.asInstanceOf[GetLifecyclePolicyRequest]
  }
}

