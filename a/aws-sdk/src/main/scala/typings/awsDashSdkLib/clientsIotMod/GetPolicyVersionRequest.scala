package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyVersionRequest extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: PolicyName
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId
}

object GetPolicyVersionRequest {
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): GetPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName, policyVersionId = policyVersionId)
  
    __obj.asInstanceOf[GetPolicyVersionRequest]
  }
}

