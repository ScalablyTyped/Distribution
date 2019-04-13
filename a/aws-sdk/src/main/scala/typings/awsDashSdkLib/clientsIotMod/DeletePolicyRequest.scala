package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePolicyRequest extends js.Object {
  /**
    * The name of the policy to delete.
    */
  var policyName: PolicyName
}

object DeletePolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName)
  
    __obj.asInstanceOf[DeletePolicyRequest]
  }
}

