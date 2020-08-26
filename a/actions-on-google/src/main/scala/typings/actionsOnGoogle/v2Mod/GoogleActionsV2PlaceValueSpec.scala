package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2PlaceValueSpec extends js.Object {
  /**
    * Speech configuration for askForPlace dialog. The extension should be used
    * to define the PlaceDialogSpec configuration.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.native
}

object GoogleActionsV2PlaceValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2PlaceValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2PlaceValueSpecOps[Self <: GoogleActionsV2PlaceValueSpec] (val x: Self) extends AnyVal {
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
    def setDialogSpec(value: GoogleActionsV2DialogSpec): Self = this.set("dialogSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogSpec: Self = this.set("dialogSpec", js.undefined)
  }
  
}

