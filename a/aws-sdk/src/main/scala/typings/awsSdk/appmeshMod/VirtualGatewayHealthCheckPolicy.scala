package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayHealthCheckPolicy extends js.Object {
  
  /**
    * The number of consecutive successful health checks that must occur before declaring the listener healthy.
    */
  var healthyThreshold: VirtualGatewayHealthCheckThreshold = js.native
  
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: VirtualGatewayHealthCheckIntervalMillis = js.native
  
  /**
    * The destination path for the health check request. This value is only used if the specified protocol is HTTP or HTTP/2. For any other protocol, this value is ignored.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The destination port for the health check request. This port must match the port defined in the PortMapping for the listener.
    */
  var port: js.UndefOr[PortNumber] = js.native
  
  /**
    * The protocol for the health check request. If you specify grpc, then your service must conform to the GRPC Health Checking Protocol.
    */
  var protocol: VirtualGatewayPortProtocol = js.native
  
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: VirtualGatewayHealthCheckTimeoutMillis = js.native
  
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
    */
  var unhealthyThreshold: VirtualGatewayHealthCheckThreshold = js.native
}
object VirtualGatewayHealthCheckPolicy {
  
  @scala.inline
  def apply(
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
  implicit class VirtualGatewayHealthCheckPolicyOps[Self <: VirtualGatewayHealthCheckPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHealthyThreshold(value: VirtualGatewayHealthCheckThreshold): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalMillis(value: VirtualGatewayHealthCheckIntervalMillis): Self = this.set("intervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: VirtualGatewayPortProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMillis(value: VirtualGatewayHealthCheckTimeoutMillis): Self = this.set("timeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThreshold(value: VirtualGatewayHealthCheckThreshold): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: PortNumber): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
