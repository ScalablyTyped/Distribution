package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagUserRequest extends js.Object {
  /**
    * The list of tags that you want to attach to the user. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
  /**
    * The name of the user that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
    */
  var UserName: existingUserNameType
}

object TagUserRequest {
  @scala.inline
  def apply(Tags: tagListType, UserName: existingUserNameType): TagUserRequest = {
    val __obj = js.Dynamic.literal(Tags = Tags, UserName = UserName)
  
    __obj.asInstanceOf[TagUserRequest]
  }
}

