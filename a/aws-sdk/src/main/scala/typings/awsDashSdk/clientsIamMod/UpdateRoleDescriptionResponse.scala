package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleDescriptionResponse extends js.Object {
  /**
    * A structure that contains details about the modified role.
    */
  var Role: js.UndefOr[typings.awsDashSdk.clientsIamMod.Role] = js.native
}

object UpdateRoleDescriptionResponse {
  @scala.inline
  def apply(Role: Role = null): UpdateRoleDescriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleDescriptionResponse]
  }
}

