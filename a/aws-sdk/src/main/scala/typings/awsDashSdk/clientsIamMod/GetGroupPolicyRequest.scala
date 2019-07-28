package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupPolicyRequest extends js.Object {
  /**
    * The name of the group the policy is associated with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
  /**
    * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
}

object GetGroupPolicyRequest {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyName: policyNameType): GetGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, PolicyName = PolicyName)
  
    __obj.asInstanceOf[GetGroupPolicyRequest]
  }
}

