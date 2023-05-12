package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAgentConfigurationRequest extends StObject {
  
  /**
    * UUID of agent to get configuration information for.
    */
  var agentId: Uuid
}
object GetAgentConfigurationRequest {
  
  inline def apply(agentId: Uuid): GetAgentConfigurationRequest = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAgentConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAgentConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentId(value: Uuid): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
  }
}
