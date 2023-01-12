package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiscoverySummaryResponse extends StObject {
  
  /**
    * Details about discovered agents, including agent status and health.
    */
  var agentSummary: js.UndefOr[CustomerAgentInfo] = js.undefined
  
  var agentlessCollectorSummary: js.UndefOr[CustomerAgentlessCollectorInfo] = js.undefined
  
  /**
    * The number of applications discovered.
    */
  var applications: js.UndefOr[Long] = js.undefined
  
  /**
    * Details about discovered connectors, including connector status and health.
    */
  var connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.undefined
  
  /**
    *  Details about Migration Evaluator collectors, including collector status and health. 
    */
  var meCollectorSummary: js.UndefOr[CustomerMeCollectorInfo] = js.undefined
  
  /**
    * The number of servers discovered.
    */
  var servers: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of servers mapped to applications.
    */
  var serversMappedToApplications: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of servers mapped to tags.
    */
  var serversMappedtoTags: js.UndefOr[Long] = js.undefined
}
object GetDiscoverySummaryResponse {
  
  inline def apply(): GetDiscoverySummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoverySummaryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDiscoverySummaryResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentSummary(value: CustomerAgentInfo): Self = StObject.set(x, "agentSummary", value.asInstanceOf[js.Any])
    
    inline def setAgentSummaryUndefined: Self = StObject.set(x, "agentSummary", js.undefined)
    
    inline def setAgentlessCollectorSummary(value: CustomerAgentlessCollectorInfo): Self = StObject.set(x, "agentlessCollectorSummary", value.asInstanceOf[js.Any])
    
    inline def setAgentlessCollectorSummaryUndefined: Self = StObject.set(x, "agentlessCollectorSummary", js.undefined)
    
    inline def setApplications(value: Long): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setConnectorSummary(value: CustomerConnectorInfo): Self = StObject.set(x, "connectorSummary", value.asInstanceOf[js.Any])
    
    inline def setConnectorSummaryUndefined: Self = StObject.set(x, "connectorSummary", js.undefined)
    
    inline def setMeCollectorSummary(value: CustomerMeCollectorInfo): Self = StObject.set(x, "meCollectorSummary", value.asInstanceOf[js.Any])
    
    inline def setMeCollectorSummaryUndefined: Self = StObject.set(x, "meCollectorSummary", js.undefined)
    
    inline def setServers(value: Long): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersMappedToApplications(value: Long): Self = StObject.set(x, "serversMappedToApplications", value.asInstanceOf[js.Any])
    
    inline def setServersMappedToApplicationsUndefined: Self = StObject.set(x, "serversMappedToApplications", js.undefined)
    
    inline def setServersMappedtoTags(value: Long): Self = StObject.set(x, "serversMappedtoTags", value.asInstanceOf[js.Any])
    
    inline def setServersMappedtoTagsUndefined: Self = StObject.set(x, "serversMappedtoTags", js.undefined)
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
  }
}
