package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectivePoliciesResponse extends js.Object {
  /**
    * The effective policies.
    */
  var effectivePolicies: js.UndefOr[EffectivePolicies] = js.undefined
}

object GetEffectivePoliciesResponse {
  @scala.inline
  def apply(effectivePolicies: EffectivePolicies = null): GetEffectivePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (effectivePolicies != null) __obj.updateDynamic("effectivePolicies")(effectivePolicies)
    __obj.asInstanceOf[GetEffectivePoliciesResponse]
  }
}

