package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleResponse extends js.Object {
  /**
    * A structure containing details about the IAM role.
    */
  var Role: typings.awsDashSdk.clientsIamMod.Role = js.native
}

object GetRoleResponse {
  @scala.inline
  def apply(Role: Role): GetRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRoleResponse]
  }
}

