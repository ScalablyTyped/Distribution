package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2ConfirmationValueSpec extends js.Object {
  /**
    * Configures dialog that asks for confirmation.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] = js.native
}

object GoogleActionsV2ConfirmationValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2ConfirmationValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2ConfirmationValueSpecOps[Self <: GoogleActionsV2ConfirmationValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDialogSpec(value: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec): Self = this.set("dialogSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogSpec: Self = this.set("dialogSpec", js.undefined)
  }
  
}

