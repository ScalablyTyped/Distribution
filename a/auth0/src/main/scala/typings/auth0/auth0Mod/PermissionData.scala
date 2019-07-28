package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionData extends js.Object {
  var permission_name: String
  var resource_server_identifier: String
}

object PermissionData {
  @scala.inline
  def apply(permission_name: String, resource_server_identifier: String): PermissionData = {
    val __obj = js.Dynamic.literal(permission_name = permission_name, resource_server_identifier = resource_server_identifier)
  
    __obj.asInstanceOf[PermissionData]
  }
}

