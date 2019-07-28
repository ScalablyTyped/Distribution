package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePasswordRequest extends js.Object {
  /**
    * The new password. The new password must conform to the AWS account's password policy, if one exists. The regex pattern that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (\\u0020) through the end of the ASCII character range (\\u00FF). You can also include the tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) characters. Any of these characters are valid in a password. However, many tools, such as the AWS Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.
    */
  var NewPassword: passwordType
  /**
    * The IAM user's current password.
    */
  var OldPassword: passwordType
}

object ChangePasswordRequest {
  @scala.inline
  def apply(NewPassword: passwordType, OldPassword: passwordType): ChangePasswordRequest = {
    val __obj = js.Dynamic.literal(NewPassword = NewPassword, OldPassword = OldPassword)
  
    __obj.asInstanceOf[ChangePasswordRequest]
  }
}

