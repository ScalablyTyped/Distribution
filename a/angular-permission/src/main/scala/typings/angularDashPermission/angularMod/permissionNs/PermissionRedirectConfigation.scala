package typings.angularDashPermission.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRedirectConfigation extends js.Object {
  var options: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
  ] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var state: String
}

object PermissionRedirectConfigation {
  @scala.inline
  def apply(
    state: String,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any = null,
    params: js.Object = null
  ): PermissionRedirectConfigation = {
    val __obj = js.Dynamic.literal(state = state)
    if (options != null) __obj.updateDynamic("options")(options)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[PermissionRedirectConfigation]
  }
}

