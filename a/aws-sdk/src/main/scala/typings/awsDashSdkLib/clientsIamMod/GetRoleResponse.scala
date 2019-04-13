package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoleResponse extends js.Object {
  /**
    * A structure containing details about the IAM role.
    */
  var Role: awsDashSdkLib.clientsIamMod.Role
}

object GetRoleResponse {
  @scala.inline
  def apply(Role: Role): GetRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role)
  
    __obj.asInstanceOf[GetRoleResponse]
  }
}

