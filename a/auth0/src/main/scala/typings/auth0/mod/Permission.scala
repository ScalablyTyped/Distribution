package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var permission_name: js.UndefOr[String] = js.undefined
  var resource_server_identifier: js.UndefOr[String] = js.undefined
  var resource_server_name: js.UndefOr[String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    description: String = null,
    permission_name: String = null,
    resource_server_identifier: String = null,
    resource_server_name: String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (permission_name != null) __obj.updateDynamic("permission_name")(permission_name.asInstanceOf[js.Any])
    if (resource_server_identifier != null) __obj.updateDynamic("resource_server_identifier")(resource_server_identifier.asInstanceOf[js.Any])
    if (resource_server_name != null) __obj.updateDynamic("resource_server_name")(resource_server_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

