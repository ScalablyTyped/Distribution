package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRoleDescriptionRequest extends js.Object {
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: roleDescriptionType
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType
}

object UpdateRoleDescriptionRequest {
  @scala.inline
  def apply(Description: roleDescriptionType, RoleName: roleNameType): UpdateRoleDescriptionRequest = {
    val __obj = js.Dynamic.literal(Description = Description, RoleName = RoleName)
  
    __obj.asInstanceOf[UpdateRoleDescriptionRequest]
  }
}

