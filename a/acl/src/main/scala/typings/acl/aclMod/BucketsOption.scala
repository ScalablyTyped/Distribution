package typings.acl.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsOption extends js.Object {
  var meta: js.UndefOr[String] = js.undefined
  var parents: js.UndefOr[String] = js.undefined
  var permissions: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[String] = js.undefined
  var roles: js.UndefOr[String] = js.undefined
  var users: js.UndefOr[String] = js.undefined
}

object BucketsOption {
  @scala.inline
  def apply(
    meta: String = null,
    parents: String = null,
    permissions: String = null,
    resources: String = null,
    roles: String = null,
    users: String = null
  ): BucketsOption = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (parents != null) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketsOption]
  }
}

