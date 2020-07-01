package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentStateChange extends js.Object {
  /** The `Agent` API object. */
  val agent: Agent
  /** The name of the agent's new state. */
  val newState: String
  /** The name of the agent's previous state. */
  val oldState: String
}

object AgentStateChange {
  @scala.inline
  def apply(agent: Agent, newState: String, oldState: String): AgentStateChange = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStateChange]
  }
}

