package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentStatusResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent status.
    */
  var AgentStatusARN: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the agent status.
    */
  var AgentStatusId: js.UndefOr[typings.awsSdk.clientsConnectMod.AgentStatusId] = js.undefined
}
object CreateAgentStatusResponse {
  
  inline def apply(): CreateAgentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAgentStatusResponse]
  }
  
  extension [Self <: CreateAgentStatusResponse](x: Self) {
    
    inline def setAgentStatusARN(value: ARN): Self = StObject.set(x, "AgentStatusARN", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusARNUndefined: Self = StObject.set(x, "AgentStatusARN", js.undefined)
    
    inline def setAgentStatusId(value: AgentStatusId): Self = StObject.set(x, "AgentStatusId", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusIdUndefined: Self = StObject.set(x, "AgentStatusId", js.undefined)
  }
}
