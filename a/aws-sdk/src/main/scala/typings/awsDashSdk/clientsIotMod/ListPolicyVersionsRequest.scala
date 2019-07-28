package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPolicyVersionsRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName
}

object ListPolicyVersionsRequest {
  @scala.inline
  def apply(policyName: PolicyName): ListPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName)
  
    __obj.asInstanceOf[ListPolicyVersionsRequest]
  }
}

