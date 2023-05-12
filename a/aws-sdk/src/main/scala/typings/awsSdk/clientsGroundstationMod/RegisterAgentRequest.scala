package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAgentRequest extends StObject {
  
  /**
    * Detailed information about the agent being registered.
    */
  var agentDetails: AgentDetails
  
  /**
    * Data for associating an agent with the capabilities it is managing.
    */
  var discoveryData: DiscoveryData
}
object RegisterAgentRequest {
  
  inline def apply(agentDetails: AgentDetails, discoveryData: DiscoveryData): RegisterAgentRequest = {
    val __obj = js.Dynamic.literal(agentDetails = agentDetails.asInstanceOf[js.Any], discoveryData = discoveryData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAgentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterAgentRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentDetails(value: AgentDetails): Self = StObject.set(x, "agentDetails", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryData(value: DiscoveryData): Self = StObject.set(x, "discoveryData", value.asInstanceOf[js.Any])
  }
}
