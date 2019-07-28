package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLifecyclePolicyRequest extends js.Object {
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typings.awsDashSdk.clientsDlmMod.PolicyId
}

object DeleteLifecyclePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): DeleteLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
  
    __obj.asInstanceOf[DeleteLifecyclePolicyRequest]
  }
}

