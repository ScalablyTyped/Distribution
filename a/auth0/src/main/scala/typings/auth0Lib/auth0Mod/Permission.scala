package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var permission_name: js.UndefOr[java.lang.String] = js.undefined
  var resource_server_identifier: js.UndefOr[java.lang.String] = js.undefined
  var resource_server_name: js.UndefOr[java.lang.String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    permission_name: java.lang.String = null,
    resource_server_identifier: java.lang.String = null,
    resource_server_name: java.lang.String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (permission_name != null) __obj.updateDynamic("permission_name")(permission_name)
    if (resource_server_identifier != null) __obj.updateDynamic("resource_server_identifier")(resource_server_identifier)
    if (resource_server_name != null) __obj.updateDynamic("resource_server_name")(resource_server_name)
    __obj.asInstanceOf[Permission]
  }
}

