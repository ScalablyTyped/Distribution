package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceLinkedRoleResponse extends js.Object {
  /**
    * A Role object that contains details about the newly created role.
    */
  var Role: js.UndefOr[Role] = js.undefined
}

object CreateServiceLinkedRoleResponse {
  @scala.inline
  def apply(Role: Role = null): CreateServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (Role != null) __obj.updateDynamic("Role")(Role)
    __obj.asInstanceOf[CreateServiceLinkedRoleResponse]
  }
}

