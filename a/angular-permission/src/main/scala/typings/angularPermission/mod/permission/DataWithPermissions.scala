package typings.angularPermission.mod.permission

import typings.angularPermission.anon.Except
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataWithPermissions extends js.Object {
  var permissions: js.UndefOr[Except] = js.undefined
}

object DataWithPermissions {
  @scala.inline
  def apply(permissions: Except = null): DataWithPermissions = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataWithPermissions]
  }
}

