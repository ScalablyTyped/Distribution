package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectStatus extends js.Object {
  /**
    * In the case of a project creation or deletion failure, a reason for the failure.
    */
  var reason: js.UndefOr[Reason] = js.undefined
  /**
    * The phase of completion for a project creation or deletion.
    */
  var state: State
}

object ProjectStatus {
  @scala.inline
  def apply(state: State, reason: Reason = null): ProjectStatus = {
    val __obj = js.Dynamic.literal(state = state)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ProjectStatus]
  }
}

