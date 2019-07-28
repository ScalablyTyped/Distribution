package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachGroupPolicyRequest extends js.Object {
  /**
    * The name (friendly name, not ARN) of the IAM group to detach the policy from. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to detach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
}

object DetachGroupPolicyRequest {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyArn: arnType): DetachGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, PolicyArn = PolicyArn)
  
    __obj.asInstanceOf[DetachGroupPolicyRequest]
  }
}

