package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheckPolicy extends js.Object {
  /**
    * The number of consecutive successful health checks that must occur before declaring
    listener healthy.
    */
  var healthyThreshold: HealthCheckThreshold = js.native
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: HealthCheckIntervalMillis = js.native
  /**
    * The destination path for the health check request. This is required only if the
    specified protocol is HTTP. If the protocol is TCP, this parameter is ignored.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The destination port for the health check request. This port must match the port defined
    in the PortMapping for the listener.
    */
  var port: js.UndefOr[PortNumber] = js.native
  /**
    * The protocol for the health check request.
    */
  var protocol: PortProtocol = js.native
  /**
    * The amount of time to wait when receiving a response from the health check, in
    milliseconds.
    */
  var timeoutMillis: HealthCheckTimeoutMillis = js.native
  /**
    * The number of consecutive failed health checks that must occur before declaring a
    virtual node unhealthy. 
    */
  var unhealthyThreshold: HealthCheckThreshold = js.native
}

object HealthCheckPolicy {
  @scala.inline
  def apply(
    healthyThreshold: HealthCheckThreshold,
    intervalMillis: HealthCheckIntervalMillis,
    protocol: PortProtocol,
    timeoutMillis: HealthCheckTimeoutMillis,
    unhealthyThreshold: HealthCheckThreshold,
    path: String = null,
    port: Int | Double = null
  ): HealthCheckPolicy = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckPolicy]
  }
}

