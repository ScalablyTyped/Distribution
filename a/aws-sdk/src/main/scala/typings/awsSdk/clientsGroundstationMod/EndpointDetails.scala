package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointDetails extends StObject {
  
  /**
    * An agent endpoint.
    */
  var awsGroundStationAgentEndpoint: js.UndefOr[AwsGroundStationAgentEndpoint] = js.undefined
  
  /**
    * A dataflow endpoint.
    */
  var endpoint: js.UndefOr[DataflowEndpoint] = js.undefined
  
  /**
    * Health reasons for a dataflow endpoint. This field is ignored when calling CreateDataflowEndpointGroup.
    */
  var healthReasons: js.UndefOr[CapabilityHealthReasonList] = js.undefined
  
  /**
    * A dataflow endpoint health status. This field is ignored when calling CreateDataflowEndpointGroup.
    */
  var healthStatus: js.UndefOr[CapabilityHealth] = js.undefined
  
  /**
    * Endpoint security details including a list of subnets, a list of security groups and a role to connect streams to instances.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.undefined
}
object EndpointDetails {
  
  inline def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointDetails] (val x: Self) extends AnyVal {
    
    inline def setAwsGroundStationAgentEndpoint(value: AwsGroundStationAgentEndpoint): Self = StObject.set(x, "awsGroundStationAgentEndpoint", value.asInstanceOf[js.Any])
    
    inline def setAwsGroundStationAgentEndpointUndefined: Self = StObject.set(x, "awsGroundStationAgentEndpoint", js.undefined)
    
    inline def setEndpoint(value: DataflowEndpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHealthReasons(value: CapabilityHealthReasonList): Self = StObject.set(x, "healthReasons", value.asInstanceOf[js.Any])
    
    inline def setHealthReasonsUndefined: Self = StObject.set(x, "healthReasons", js.undefined)
    
    inline def setHealthReasonsVarargs(value: CapabilityHealthReason*): Self = StObject.set(x, "healthReasons", js.Array(value*))
    
    inline def setHealthStatus(value: CapabilityHealth): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setSecurityDetails(value: SecurityDetails): Self = StObject.set(x, "securityDetails", value.asInstanceOf[js.Any])
    
    inline def setSecurityDetailsUndefined: Self = StObject.set(x, "securityDetails", js.undefined)
  }
}
