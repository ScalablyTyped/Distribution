package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyRequest extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: PolicyName
}

object GetPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName)
  
    __obj.asInstanceOf[GetPolicyRequest]
  }
}

