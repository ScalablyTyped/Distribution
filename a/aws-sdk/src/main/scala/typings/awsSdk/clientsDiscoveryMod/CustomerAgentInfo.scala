package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerAgentInfo extends StObject {
  
  /**
    * Number of active discovery agents.
    */
  var activeAgents: Integer
  
  /**
    * Number of blacklisted discovery agents.
    */
  var blackListedAgents: Integer
  
  /**
    * Number of healthy discovery agents
    */
  var healthyAgents: Integer
  
  /**
    * Number of discovery agents with status SHUTDOWN.
    */
  var shutdownAgents: Integer
  
  /**
    * Total number of discovery agents.
    */
  var totalAgents: Integer
  
  /**
    * Number of unhealthy discovery agents.
    */
  var unhealthyAgents: Integer
  
  /**
    * Number of unknown discovery agents.
    */
  var unknownAgents: Integer
}
object CustomerAgentInfo {
  
  inline def apply(
    activeAgents: Integer,
    blackListedAgents: Integer,
    healthyAgents: Integer,
    shutdownAgents: Integer,
    totalAgents: Integer,
    unhealthyAgents: Integer,
    unknownAgents: Integer
  ): CustomerAgentInfo = {
    val __obj = js.Dynamic.literal(activeAgents = activeAgents.asInstanceOf[js.Any], blackListedAgents = blackListedAgents.asInstanceOf[js.Any], healthyAgents = healthyAgents.asInstanceOf[js.Any], shutdownAgents = shutdownAgents.asInstanceOf[js.Any], totalAgents = totalAgents.asInstanceOf[js.Any], unhealthyAgents = unhealthyAgents.asInstanceOf[js.Any], unknownAgents = unknownAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerAgentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerAgentInfo] (val x: Self) extends AnyVal {
    
    inline def setActiveAgents(value: Integer): Self = StObject.set(x, "activeAgents", value.asInstanceOf[js.Any])
    
    inline def setBlackListedAgents(value: Integer): Self = StObject.set(x, "blackListedAgents", value.asInstanceOf[js.Any])
    
    inline def setHealthyAgents(value: Integer): Self = StObject.set(x, "healthyAgents", value.asInstanceOf[js.Any])
    
    inline def setShutdownAgents(value: Integer): Self = StObject.set(x, "shutdownAgents", value.asInstanceOf[js.Any])
    
    inline def setTotalAgents(value: Integer): Self = StObject.set(x, "totalAgents", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyAgents(value: Integer): Self = StObject.set(x, "unhealthyAgents", value.asInstanceOf[js.Any])
    
    inline def setUnknownAgents(value: Integer): Self = StObject.set(x, "unknownAgents", value.asInstanceOf[js.Any])
  }
}
