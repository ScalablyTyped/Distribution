package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLifecyclePoliciesResponse extends js.Object {
  /**
    * Summary information about the lifecycle policies.
    */
  var Policies: js.UndefOr[LifecyclePolicySummaryList] = js.undefined
}

object GetLifecyclePoliciesResponse {
  @scala.inline
  def apply(Policies: LifecyclePolicySummaryList = null): GetLifecyclePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    __obj.asInstanceOf[GetLifecyclePoliciesResponse]
  }
}

