package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /**
    * When entering this state, perform these "actions" if the "condition" is TRUE.
    */
  var onEnter: js.UndefOr[OnEnterLifecycle] = js.undefined
  /**
    * When exiting this state, perform these "actions" if the specified "condition" is TRUE.
    */
  var onExit: js.UndefOr[OnExitLifecycle] = js.undefined
  /**
    * When an input is received and the "condition" is TRUE, perform the specified "actions".
    */
  var onInput: js.UndefOr[OnInputLifecycle] = js.undefined
  /**
    * The name of the state.
    */
  var stateName: StateName
}

object State {
  @scala.inline
  def apply(
    stateName: StateName,
    onEnter: OnEnterLifecycle = null,
    onExit: OnExitLifecycle = null,
    onInput: OnInputLifecycle = null
  ): State = {
    val __obj = js.Dynamic.literal(stateName = stateName)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    __obj.asInstanceOf[State]
  }
}

