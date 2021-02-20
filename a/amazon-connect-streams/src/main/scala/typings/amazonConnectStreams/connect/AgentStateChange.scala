package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentStateChange extends StObject {
  
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
  implicit class AgentStateChangeMutableBuilder[Self <: AgentStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: String): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
  }
}
