package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePermissionPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup from which you want to delete the policy. The user making the request must be the owner of the RuleGroup.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafMod.ResourceArn
}

object DeletePermissionPolicyRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): DeletePermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[DeletePermissionPolicyRequest]
  }
}

