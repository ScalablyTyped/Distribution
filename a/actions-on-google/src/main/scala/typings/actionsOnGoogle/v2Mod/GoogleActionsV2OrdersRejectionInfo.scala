package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersRejectionInfo extends js.Object {
  /**
    * Reason for the error.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Rejection type.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersRejectionInfoType] = js.native
}

object GoogleActionsV2OrdersRejectionInfo {
  @scala.inline
  def apply(): GoogleActionsV2OrdersRejectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersRejectionInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersRejectionInfoOps[Self <: GoogleActionsV2OrdersRejectionInfo] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setType(value: GoogleActionsV2OrdersRejectionInfoType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

