package typings.amazonConnectStreams.connect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing the current Agent state. */
trait AgentState extends js.Object {
  /** The agent's current state ARN. */
  val agentStateARN: String | Null
  /** The name of the agent's current availability state. */
  val name: String
  /** Indicates when the state was set. */
  val startTimestamp: Date
  /** The agent's current availability state type, as per the `AgentStateType` enumeration. */
  val `type`: AgentStateType
}

object AgentState {
  @scala.inline
  def apply(name: String, startTimestamp: Date, `type`: AgentStateType, agentStateARN: String = null): AgentState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], agentStateARN = agentStateARN.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentState]
  }
}

