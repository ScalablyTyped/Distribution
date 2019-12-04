package typings.angularDashPermission.angularMod.permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRedirectConfigation extends js.Object {
  var options: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
  ] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var state: String
}

object PermissionRedirectConfigation {
  @scala.inline
  def apply(
    state: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any = null,
    params: js.Object = null
  ): PermissionRedirectConfigation = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRedirectConfigation]
  }
}

