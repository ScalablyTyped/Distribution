package typings.amazonConnectStreams.connect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object containing the current Agent state. */
@js.native
trait AgentState extends js.Object {
  
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
  implicit class AgentStateOps[Self <: AgentState] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: Date): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AgentStateType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentStateARN(value: String): Self = this.set("agentStateARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentStateARNNull: Self = this.set("agentStateARN", null)
  }
}
