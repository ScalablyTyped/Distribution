package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayHealthCheckPolicy extends StObject {
  
  /**
    * The number of consecutive successful health checks that must occur before declaring the listener healthy.
    */
  var healthyThreshold: VirtualGatewayHealthCheckThreshold
  
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: VirtualGatewayHealthCheckIntervalMillis
  
  /**
    * The destination path for the health check request. This value is only used if the specified protocol is HTTP or HTTP/2. For any other protocol, this value is ignored.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The destination port for the health check request. This port must match the port defined in the PortMapping for the listener.
    */
  var port: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The protocol for the health check request. If you specify grpc, then your service must conform to the GRPC Health Checking Protocol.
    */
  var protocol: VirtualGatewayPortProtocol
  
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: VirtualGatewayHealthCheckTimeoutMillis
  
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
    */
  var unhealthyThreshold: VirtualGatewayHealthCheckThreshold
}
object VirtualGatewayHealthCheckPolicy {
  
  inline def apply(
    healthyThreshold: VirtualGatewayHealthCheckThreshold,
    intervalMillis: VirtualGatewayHealthCheckIntervalMillis,
    protocol: VirtualGatewayPortProtocol,
    timeoutMillis: VirtualGatewayHealthCheckTimeoutMillis,
    unhealthyThreshold: VirtualGatewayHealthCheckThreshold
  ): VirtualGatewayHealthCheckPolicy = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayHealthCheckPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualGatewayHealthCheckPolicy] (val x: Self) extends AnyVal {
    
    inline def setHealthyThreshold(value: VirtualGatewayHealthCheckThreshold): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setIntervalMillis(value: VirtualGatewayHealthCheckIntervalMillis): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: VirtualGatewayPortProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMillis(value: VirtualGatewayHealthCheckTimeoutMillis): Self = StObject.set(x, "timeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThreshold(value: VirtualGatewayHealthCheckThreshold): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
