package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRoleDescriptionResponse extends js.Object {
  /**
    * A structure that contains details about the modified role.
    */
  var Role: js.UndefOr[Role] = js.undefined
}

object UpdateRoleDescriptionResponse {
  @scala.inline
  def apply(Role: Role = null): UpdateRoleDescriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (Role != null) __obj.updateDynamic("Role")(Role)
    __obj.asInstanceOf[UpdateRoleDescriptionResponse]
  }
}

