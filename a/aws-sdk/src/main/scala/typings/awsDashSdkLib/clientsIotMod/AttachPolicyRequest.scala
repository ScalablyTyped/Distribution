package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachPolicyRequest extends js.Object {
  /**
    * The name of the policy to attach.
    */
  var policyName: PolicyName
  /**
    * The identity to which the policy is attached.
    */
  var target: PolicyTarget
}

object AttachPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, target: PolicyTarget): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName, target = target)
  
    __obj.asInstanceOf[AttachPolicyRequest]
  }
}

