package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagUserRequest extends js.Object {
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified user.
    */
  var TagKeys: tagKeyListType
  /**
    * The name of the IAM user from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
    */
  var UserName: existingUserNameType
}

object UntagUserRequest {
  @scala.inline
  def apply(TagKeys: tagKeyListType, UserName: existingUserNameType): UntagUserRequest = {
    val __obj = js.Dynamic.literal(TagKeys = TagKeys, UserName = UserName)
  
    __obj.asInstanceOf[UntagUserRequest]
  }
}

