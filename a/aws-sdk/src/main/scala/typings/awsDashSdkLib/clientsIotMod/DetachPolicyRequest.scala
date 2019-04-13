package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachPolicyRequest extends js.Object {
  /**
    * The policy to detach.
    */
  var policyName: PolicyName
  /**
    * The target from which the policy will be detached.
    */
  var target: PolicyTarget
}

object DetachPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, target: PolicyTarget): DetachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName, target = target)
  
    __obj.asInstanceOf[DetachPolicyRequest]
  }
}

