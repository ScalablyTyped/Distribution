package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DialogSpec extends js.Object {
  /**
    * Holds helper specific dialog specs if any. For example:
    * ConfirmationDialogSpec for confirmation helper.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
}

object GoogleActionsV2DialogSpec {
  @scala.inline
  def apply(): GoogleActionsV2DialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DialogSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2DialogSpecOps[Self <: GoogleActionsV2DialogSpec] (val x: Self) extends AnyVal {
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
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
  }
  
}

