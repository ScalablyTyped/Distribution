package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentStateChange extends js.Object {
  
  /** The `Agent` API object. */
  val agent: Agent = js.native
  
  /** The name of the agent's new state. */
  val newState: String = js.native
  
  /** The name of the agent's previous state. */
  val oldState: String = js.native
}
object AgentStateChange {
  
  @scala.inline
  def apply(agent: Agent, newState: String, oldState: String): AgentStateChange = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStateChange]
  }
  
  @scala.inline
  implicit class AgentStateChangeOps[Self <: AgentStateChange] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewState(value: String): Self = this.set("newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: String): Self = this.set("oldState", value.asInstanceOf[js.Any])
  }
}
