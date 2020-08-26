package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersInTransitInfo extends js.Object {
  /**
    * Last updated time for in transit.
    */
  var updatedTime: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersInTransitInfo {
  @scala.inline
  def apply(): GoogleActionsV2OrdersInTransitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersInTransitInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersInTransitInfoOps[Self <: GoogleActionsV2OrdersInTransitInfo] (val x: Self) extends AnyVal {
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
    def setUpdatedTime(value: String): Self = this.set("updatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedTime: Self = this.set("updatedTime", js.undefined)
  }
  
}

