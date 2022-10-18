package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentInfo extends StObject {
  
  /**
    * The timestamp when the contact was connected to the agent.
    */
  var ConnectedToAgentTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the agent who accepted the contact.
    */
  var Id: js.UndefOr[AgentResourceId] = js.undefined
}
object AgentInfo {
  
  inline def apply(): AgentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentInfo]
  }
  
  extension [Self <: AgentInfo](x: Self) {
    
    inline def setConnectedToAgentTimestamp(value: js.Date): Self = StObject.set(x, "ConnectedToAgentTimestamp", value.asInstanceOf[js.Any])
    
    inline def setConnectedToAgentTimestampUndefined: Self = StObject.set(x, "ConnectedToAgentTimestamp", js.undefined)
    
    inline def setId(value: AgentResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
