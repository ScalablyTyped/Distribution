package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoleResponse extends js.Object {
  /**
    * A structure containing details about the new role.
    */
  var Role: awsDashSdkLib.clientsIamMod.Role
}

object CreateRoleResponse {
  @scala.inline
  def apply(Role: Role): CreateRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role)
  
    __obj.asInstanceOf[CreateRoleResponse]
  }
}

