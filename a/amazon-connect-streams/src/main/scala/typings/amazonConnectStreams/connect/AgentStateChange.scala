package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the Agent old state and new state
  */
trait AgentStateChange extends js.Object {
  /**
    * The Agent object
    */
  var agent: Agent
  /**
    * The name of the agent's new state.
    */
  var newState: String
  /**
    * The name of the agent's previous state.
    */
  var oldState: String
}

object AgentStateChange {
  @scala.inline
  def apply(agent: Agent, newState: String, oldState: String): AgentStateChange = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStateChange]
  }
}

