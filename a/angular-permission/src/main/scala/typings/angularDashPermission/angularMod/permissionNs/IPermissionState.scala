package typings.angularDashPermission.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify angular.ui.IState * / any */ trait IPermissionState extends js.Object {
  var data: js.UndefOr[js.Any | DataWithPermissions] = js.undefined
}

object IPermissionState {
  @scala.inline
  def apply(data: js.Any | DataWithPermissions = null): IPermissionState = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPermissionState]
  }
}

