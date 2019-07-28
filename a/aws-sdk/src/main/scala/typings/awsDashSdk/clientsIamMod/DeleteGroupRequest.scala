package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupRequest extends js.Object {
  /**
    * The name of the IAM group to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
}

object DeleteGroupRequest {
  @scala.inline
  def apply(GroupName: groupNameType): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
  
    __obj.asInstanceOf[DeleteGroupRequest]
  }
}

