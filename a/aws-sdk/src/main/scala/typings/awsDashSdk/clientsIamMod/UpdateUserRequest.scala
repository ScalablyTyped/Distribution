package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserRequest extends js.Object {
  /**
    * New path for the IAM user. Include this parameter only if you're changing the user's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var NewPath: js.UndefOr[pathType] = js.undefined
  /**
    * New name for the user. Include this parameter only if you're changing the user's name. IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
    */
  var NewUserName: js.UndefOr[userNameType] = js.undefined
  /**
    * Name of the user to update. If you're changing the name of the user, this is the original user name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}

object UpdateUserRequest {
  @scala.inline
  def apply(UserName: existingUserNameType, NewPath: pathType = null, NewUserName: userNameType = null): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName)
    if (NewPath != null) __obj.updateDynamic("NewPath")(NewPath)
    if (NewUserName != null) __obj.updateDynamic("NewUserName")(NewUserName)
    __obj.asInstanceOf[UpdateUserRequest]
  }
}

