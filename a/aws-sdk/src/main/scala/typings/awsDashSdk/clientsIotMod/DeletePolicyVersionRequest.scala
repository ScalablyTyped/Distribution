package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePolicyVersionRequest extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: PolicyName = js.native
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId = js.native
}

object DeletePolicyVersionRequest {
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): DeletePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePolicyVersionRequest]
  }
}

