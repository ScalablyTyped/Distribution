package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersOrderState extends js.Object {
  /**
    * The user-visible string for the state. Required.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * State can be one of the following values:
    *
    * `CREATED`: Order was created at integrator's system.
    * `REJECTED`: Order was rejected by integrator.
    * `CONFIRMED`: Order was confirmed by the integrator and is active.
    * `CANCELLED`: User cancelled the order.
    * `IN_TRANSIT`: Order is being delivered.
    * `RETURNED`: User did a return.
    * `FULFILLED`: User received what was ordered.
    * 'CHANGE_REQUESTED': User has requested a change to the order, and
    *           the integrator is processing this change. The
    *           order should be moved to another state after the
    *           request is handled.
    *
    * Required.
    */
  var state: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersOrderState {
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderState]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderStateOps[Self <: GoogleActionsV2OrdersOrderState] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

