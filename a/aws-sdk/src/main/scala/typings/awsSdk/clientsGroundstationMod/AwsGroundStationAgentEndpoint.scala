package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsGroundStationAgentEndpoint extends StObject {
  
  /**
    * The status of AgentEndpoint.
    */
  var agentStatus: js.UndefOr[AgentStatus] = js.undefined
  
  /**
    * The results of the audit.
    */
  var auditResults: js.UndefOr[AuditResults] = js.undefined
  
  /**
    * The egress address of AgentEndpoint.
    */
  var egressAddress: ConnectionDetails
  
  /**
    * The ingress address of AgentEndpoint.
    */
  var ingressAddress: RangedConnectionDetails
  
  /**
    * Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
    */
  var name: SafeName
}
object AwsGroundStationAgentEndpoint {
  
  inline def apply(egressAddress: ConnectionDetails, ingressAddress: RangedConnectionDetails, name: SafeName): AwsGroundStationAgentEndpoint = {
    val __obj = js.Dynamic.literal(egressAddress = egressAddress.asInstanceOf[js.Any], ingressAddress = ingressAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsGroundStationAgentEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsGroundStationAgentEndpoint] (val x: Self) extends AnyVal {
    
    inline def setAgentStatus(value: AgentStatus): Self = StObject.set(x, "agentStatus", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusUndefined: Self = StObject.set(x, "agentStatus", js.undefined)
    
    inline def setAuditResults(value: AuditResults): Self = StObject.set(x, "auditResults", value.asInstanceOf[js.Any])
    
    inline def setAuditResultsUndefined: Self = StObject.set(x, "auditResults", js.undefined)
    
    inline def setEgressAddress(value: ConnectionDetails): Self = StObject.set(x, "egressAddress", value.asInstanceOf[js.Any])
    
    inline def setIngressAddress(value: RangedConnectionDetails): Self = StObject.set(x, "ingressAddress", value.asInstanceOf[js.Any])
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
