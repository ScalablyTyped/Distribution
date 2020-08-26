package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2SignInValue extends js.Object {
  /**
    * The status of the sign in requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2SignInValueStatus] = js.native
}

object GoogleActionsV2SignInValue {
  @scala.inline
  def apply(): GoogleActionsV2SignInValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignInValue]
  }
  @scala.inline
  implicit class GoogleActionsV2SignInValueOps[Self <: GoogleActionsV2SignInValue] (val x: Self) extends AnyVal {
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
    def setStatus(value: GoogleActionsV2SignInValueStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

