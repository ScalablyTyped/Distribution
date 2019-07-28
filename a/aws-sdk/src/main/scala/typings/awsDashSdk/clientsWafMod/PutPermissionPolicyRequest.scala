package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPermissionPolicyRequest extends js.Object {
  /**
    * The policy to attach to the specified RuleGroup.
    */
  var Policy: PolicyString
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafMod.ResourceArn
}

object PutPermissionPolicyRequest {
  @scala.inline
  def apply(Policy: PolicyString, ResourceArn: ResourceArn): PutPermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy, ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[PutPermissionPolicyRequest]
  }
}

