package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DialogSpec extends js.Object {
  /**
    * Holds helper specific dialog specs if any. For example:
    * ConfirmationDialogSpec for confirmation helper.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object GoogleActionsV2DialogSpec {
  @scala.inline
  def apply(extension: ApiClientObjectMap[_] = null): GoogleActionsV2DialogSpec = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2DialogSpec]
  }
}

