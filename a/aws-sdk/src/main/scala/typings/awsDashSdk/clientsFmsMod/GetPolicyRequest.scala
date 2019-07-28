package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyRequest extends js.Object {
  /**
    * The ID of the AWS Firewall Manager policy that you want the details for.
    */
  var PolicyId: typings.awsDashSdk.clientsFmsMod.PolicyId
}

object GetPolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
  
    __obj.asInstanceOf[GetPolicyRequest]
  }
}

