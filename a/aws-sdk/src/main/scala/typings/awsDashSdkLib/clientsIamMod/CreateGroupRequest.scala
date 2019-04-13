package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupRequest extends js.Object {
  /**
    * The name of the group to create. Do not include the path in this value. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-. The group name must be unique within the account. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
    */
  var GroupName: groupNameType
  /**
    *  The path to the group. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[pathType] = js.undefined
}

object CreateGroupRequest {
  @scala.inline
  def apply(GroupName: groupNameType, Path: pathType = null): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[CreateGroupRequest]
  }
}

