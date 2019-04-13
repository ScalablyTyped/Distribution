package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDefaultPolicyVersionRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId
}

object SetDefaultPolicyVersionRequest {
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName, policyVersionId = policyVersionId)
  
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
}

