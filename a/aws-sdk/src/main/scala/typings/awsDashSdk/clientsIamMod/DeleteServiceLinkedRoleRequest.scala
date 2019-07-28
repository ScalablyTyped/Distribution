package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServiceLinkedRoleRequest extends js.Object {
  /**
    * The name of the service-linked role to be deleted.
    */
  var RoleName: roleNameType
}

object DeleteServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType): DeleteServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName)
  
    __obj.asInstanceOf[DeleteServiceLinkedRoleRequest]
  }
}

