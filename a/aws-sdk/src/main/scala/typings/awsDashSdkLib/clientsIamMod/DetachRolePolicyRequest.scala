package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachRolePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to detach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
  /**
    * The name (friendly name, not ARN) of the IAM role to detach the policy from. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object DetachRolePolicyRequest {
  @scala.inline
  def apply(PolicyArn: arnType, RoleName: roleNameType): DetachRolePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn, RoleName = RoleName)
  
    __obj.asInstanceOf[DetachRolePolicyRequest]
  }
}

