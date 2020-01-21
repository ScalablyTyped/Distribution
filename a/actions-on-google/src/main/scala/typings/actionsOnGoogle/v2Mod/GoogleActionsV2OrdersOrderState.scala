package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersOrderState extends js.Object {
  /**
    * The user-visible string for the state. Required.
    */
  var label: js.UndefOr[String] = js.undefined
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
  var state: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersOrderState {
  @scala.inline
  def apply(label: String = null, state: String = null): GoogleActionsV2OrdersOrderState = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderState]
  }
}

