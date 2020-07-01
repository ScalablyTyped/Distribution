package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentStateDefinition extends js.Object {
  /** The agent state ARN. */
  val agentStateARN: String
  /** The name of the agent state to be displayed in the UI. */
  val name: String
  /** The agent state type. */
  val `type`: AgentStateType
}

object AgentStateDefinition {
  @scala.inline
  def apply(agentStateARN: String, name: String, `type`: AgentStateType): AgentStateDefinition = {
    val __obj = js.Dynamic.literal(agentStateARN = agentStateARN.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStateDefinition]
  }
}

