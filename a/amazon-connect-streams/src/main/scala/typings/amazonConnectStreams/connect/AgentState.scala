package typings.amazonConnectStreams.connect

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
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether the agent is currently muted.
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the agent's current availability state.
    */
  var name: String
  /**
    * The agent's current availability state type, as per the AgentStateType enumeration.
    */
  var `type`: AgentStateType
}

object AgentState {
  @scala.inline
  def apply(
    name: String,
    `type`: AgentStateType,
    duration: js.UndefOr[Double] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined
  ): AgentState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentState]
  }
}

