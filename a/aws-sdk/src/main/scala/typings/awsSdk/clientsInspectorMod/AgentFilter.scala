package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentFilter extends StObject {
  
  /**
    * The detailed health state of the agent. Values can be set to IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, and UNKNOWN. 
    */
  var agentHealthCodes: AgentHealthCodeList
  
  /**
    * The current health state of the agent. Values can be set to HEALTHY or UNHEALTHY.
    */
  var agentHealths: AgentHealthList
}
object AgentFilter {
  
  inline def apply(agentHealthCodes: AgentHealthCodeList, agentHealths: AgentHealthList): AgentFilter = {
    val __obj = js.Dynamic.literal(agentHealthCodes = agentHealthCodes.asInstanceOf[js.Any], agentHealths = agentHealths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentFilter]
  }
  
  extension [Self <: AgentFilter](x: Self) {
    
    inline def setAgentHealthCodes(value: AgentHealthCodeList): Self = StObject.set(x, "agentHealthCodes", value.asInstanceOf[js.Any])
    
    inline def setAgentHealthCodesVarargs(value: AgentHealthCode*): Self = StObject.set(x, "agentHealthCodes", js.Array(value*))
    
    inline def setAgentHealths(value: AgentHealthList): Self = StObject.set(x, "agentHealths", value.asInstanceOf[js.Any])
    
    inline def setAgentHealthsVarargs(value: AgentHealth*): Self = StObject.set(x, "agentHealths", js.Array(value*))
  }
}
