package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePolicyVersionRequest extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: PolicyName
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId
}

object DeletePolicyVersionRequest {
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): DeletePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName, policyVersionId = policyVersionId)
  
    __obj.asInstanceOf[DeletePolicyVersionRequest]
  }
}

