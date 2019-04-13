package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsOption extends js.Object {
  var meta: js.UndefOr[java.lang.String] = js.undefined
  var parents: js.UndefOr[java.lang.String] = js.undefined
  var permissions: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[java.lang.String] = js.undefined
  var roles: js.UndefOr[java.lang.String] = js.undefined
  var users: js.UndefOr[java.lang.String] = js.undefined
}

object BucketsOption {
  @scala.inline
  def apply(
    meta: java.lang.String = null,
    parents: java.lang.String = null,
    permissions: java.lang.String = null,
    resources: java.lang.String = null,
    roles: java.lang.String = null,
    users: java.lang.String = null
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

