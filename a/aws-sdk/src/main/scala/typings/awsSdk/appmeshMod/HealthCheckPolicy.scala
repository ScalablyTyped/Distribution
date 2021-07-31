package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheckPolicy extends StObject {
  
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    */
  var healthyThreshold: HealthCheckThreshold
  
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: HealthCheckIntervalMillis
  
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
  var protocol: PortProtocol
  
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: HealthCheckTimeoutMillis
  
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy. 
    */
  var unhealthyThreshold: HealthCheckThreshold
}
object HealthCheckPolicy {
  
  @scala.inline
  def apply(
    healthyThreshold: HealthCheckThreshold,
    intervalMillis: HealthCheckIntervalMillis,
    protocol: PortProtocol,
    timeoutMillis: HealthCheckTimeoutMillis,
    unhealthyThreshold: HealthCheckThreshold
  ): HealthCheckPolicy = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckPolicy]
  }
  
  @scala.inline
  implicit class HealthCheckPolicyMutableBuilder[Self <: HealthCheckPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthyThreshold(value: HealthCheckThreshold): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalMillis(value: HealthCheckIntervalMillis): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: PortProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMillis(value: HealthCheckTimeoutMillis): Self = StObject.set(x, "timeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThreshold(value: HealthCheckThreshold): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
