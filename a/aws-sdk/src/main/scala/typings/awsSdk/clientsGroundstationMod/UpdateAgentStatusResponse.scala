package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentStatusResponse extends StObject {
  
  /**
    * UUID of updated agent.
    */
  var agentId: Uuid
}
object UpdateAgentStatusResponse {
  
  inline def apply(agentId: Uuid): UpdateAgentStatusResponse = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAgentStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentId(value: Uuid): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
  }
}
