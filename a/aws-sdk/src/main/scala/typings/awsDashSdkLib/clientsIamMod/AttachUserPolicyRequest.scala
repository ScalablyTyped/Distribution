package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachUserPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to attach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
  /**
    * The name (friendly name, not ARN) of the IAM user to attach the policy to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}

object AttachUserPolicyRequest {
  @scala.inline
  def apply(PolicyArn: arnType, UserName: userNameType): AttachUserPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn, UserName = UserName)
  
    __obj.asInstanceOf[AttachUserPolicyRequest]
  }
}

