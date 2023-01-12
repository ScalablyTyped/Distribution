package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object containing the current Agent state. */
trait AgentState extends StObject {
  
  /** The agent's current state ARN. */
  val agentStateARN: String | Null
  
  /** The name of the agent's current availability state. */
  val name: String
  
  /** Indicates when the state was set. */
  val startTimestamp: js.Date
  
  /** The agent's current availability state type, as per the `AgentStateType` enumeration. */
  val `type`: AgentStateType
}
object AgentState {
  
  inline def apply(name: String, startTimestamp: js.Date, `type`: AgentStateType): AgentState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], agentStateARN = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentState] (val x: Self) extends AnyVal {
    
    inline def setAgentStateARN(value: String): Self = StObject.set(x, "agentStateARN", value.asInstanceOf[js.Any])
    
    inline def setAgentStateARNNull: Self = StObject.set(x, "agentStateARN", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: AgentStateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
