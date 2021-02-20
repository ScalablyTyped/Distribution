package typings.amazonConnectStreams.connect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object containing the current Agent state. */
@js.native
trait AgentState extends StObject {
  
  /** The agent's current state ARN. */
  val agentStateARN: String | Null = js.native
  
  /** The name of the agent's current availability state. */
  val name: String = js.native
  
  /** Indicates when the state was set. */
  val startTimestamp: Date = js.native
  
  /** The agent's current availability state type, as per the `AgentStateType` enumeration. */
  val `type`: AgentStateType = js.native
}
object AgentState {
  
  @scala.inline
  def apply(name: String, startTimestamp: Date, `type`: AgentStateType): AgentState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentState]
  }
  
  @scala.inline
  implicit class AgentStateMutableBuilder[Self <: AgentState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentStateARN(value: String): Self = StObject.set(x, "agentStateARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentStateARNNull: Self = StObject.set(x, "agentStateARN", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: Date): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AgentStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
