package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentStateDefinition extends StObject {
  
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
  
  @scala.inline
  implicit class AgentStateDefinitionMutableBuilder[Self <: AgentStateDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentStateARN(value: String): Self = StObject.set(x, "agentStateARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AgentStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
