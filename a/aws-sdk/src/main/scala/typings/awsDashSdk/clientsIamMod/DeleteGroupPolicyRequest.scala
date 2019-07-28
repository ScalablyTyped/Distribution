package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupPolicyRequest extends js.Object {
  /**
    * The name (friendly name, not ARN) identifying the group that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
  /**
    * The name identifying the policy document to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
}

object DeleteGroupPolicyRequest {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyName: policyNameType): DeleteGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, PolicyName = PolicyName)
  
    __obj.asInstanceOf[DeleteGroupPolicyRequest]
  }
}

