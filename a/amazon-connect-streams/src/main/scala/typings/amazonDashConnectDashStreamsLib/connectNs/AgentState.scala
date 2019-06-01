package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the current Agent state
  */
trait AgentState extends js.Object {
  /**
    * A relative local state duration. To get the actual duration of the state relative
    * to the current time, use agent.getStateDuration().
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether the agent is currently muted.
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the agent's current availability state.
    */
  var name: java.lang.String
  /**
    * The agent's current availability state type, as per the AgentStateType enumeration.
    */
  var `type`: AgentStateType
}

object AgentState {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: AgentStateType,
    duration: scala.Int | scala.Double = null,
    muted: js.UndefOr[scala.Boolean] = js.undefined
  ): AgentState = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    __obj.asInstanceOf[AgentState]
  }
}

