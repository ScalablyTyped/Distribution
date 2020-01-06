package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyRequest extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: PolicyName = js.native
}

object GetPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPolicyRequest]
  }
}

