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
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (parents != null) __obj.updateDynamic("parents")(parents)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[BucketsOption]
  }
}

