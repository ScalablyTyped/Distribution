package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec extends js.Object {
  /**
    * This is the question asked by confirmation sub-dialog. For example \"Are
    * you sure about that?\"
    */
  var requestConfirmationText: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec {
  @scala.inline
  def apply(requestConfirmationText: String = null): GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec = {
    val __obj = js.Dynamic.literal()
    if (requestConfirmationText != null) __obj.updateDynamic("requestConfirmationText")(requestConfirmationText.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec]
  }
}

