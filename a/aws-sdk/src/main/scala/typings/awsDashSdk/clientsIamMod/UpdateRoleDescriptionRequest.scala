package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleDescriptionRequest extends js.Object {
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: roleDescriptionType = js.native
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType = js.native
}

object UpdateRoleDescriptionRequest {
  @scala.inline
  def apply(Description: roleDescriptionType, RoleName: roleNameType): UpdateRoleDescriptionRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRoleDescriptionRequest]
  }
}

