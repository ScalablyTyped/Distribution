package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2ConfirmationValueSpec extends js.Object {
  /**
    * Configures dialog that asks for confirmation.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] = js.undefined
}

object GoogleActionsV2ConfirmationValueSpec {
  @scala.inline
  def apply(dialogSpec: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec = null): GoogleActionsV2ConfirmationValueSpec = {
    val __obj = js.Dynamic.literal()
    if (dialogSpec != null) __obj.updateDynamic("dialogSpec")(dialogSpec)
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpec]
  }
}

