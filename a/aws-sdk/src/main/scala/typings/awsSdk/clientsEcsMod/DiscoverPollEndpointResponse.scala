package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverPollEndpointResponse extends StObject {
  
  /**
    * The endpoint for the Amazon ECS agent to poll.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint for the Amazon ECS agent to poll for Service Connect configuration. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var serviceConnectEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The telemetry endpoint for the Amazon ECS agent.
    */
  var telemetryEndpoint: js.UndefOr[String] = js.undefined
}
object DiscoverPollEndpointResponse {
  
  inline def apply(): DiscoverPollEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverPollEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoverPollEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setServiceConnectEndpoint(value: String): Self = StObject.set(x, "serviceConnectEndpoint", value.asInstanceOf[js.Any])
    
    inline def setServiceConnectEndpointUndefined: Self = StObject.set(x, "serviceConnectEndpoint", js.undefined)
    
    inline def setTelemetryEndpoint(value: String): Self = StObject.set(x, "telemetryEndpoint", value.asInstanceOf[js.Any])
    
    inline def setTelemetryEndpointUndefined: Self = StObject.set(x, "telemetryEndpoint", js.undefined)
  }
}
