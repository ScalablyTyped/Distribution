package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentStateDefinition extends js.Object {
  
  /** The agent state ARN. */
  val agentStateARN: String = js.native
  
  /** The name of the agent state to be displayed in the UI. */
  val name: String = js.native
  
  /** The agent state type. */
  val `type`: AgentStateType = js.native
}
object AgentStateDefinition {
  
  @scala.inline
  def apply(agentStateARN: String, name: String, `type`: AgentStateType): AgentStateDefinition = {
    val __obj = js.Dynamic.literal(agentStateARN = agentStateARN.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStateDefinition]
  }
  
  @scala.inline
  implicit class AgentStateDefinitionOps[Self <: AgentStateDefinition] (val x: Self) extends AnyVal {
    
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
    def setAgentStateARN(value: String): Self = this.set("agentStateARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AgentStateType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
