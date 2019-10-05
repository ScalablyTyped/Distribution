package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheckPolicy extends js.Object {
  /**
    * The number of consecutive successful health checks that must occur before declaring
    listener healthy.
    */
  var healthyThreshold: HealthCheckThreshold
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: HealthCheckIntervalMillis
  /**
    * The destination path for the health check request. This is required only if the
    specified protocol is HTTP. If the protocol is TCP, this parameter is ignored.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The destination port for the health check request. This port must match the port defined
    in the PortMapping for the listener.
    */
  var port: js.UndefOr[PortNumber] = js.undefined
  /**
    * The protocol for the health check request.
    */
  var protocol: PortProtocol
  /**
    * The amount of time to wait when receiving a response from the health check, in
    milliseconds.
    */
  var timeoutMillis: HealthCheckTimeoutMillis
  /**
    * The number of consecutive failed health checks that must occur before declaring a
    virtual node unhealthy. 
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
    unhealthyThreshold: HealthCheckThreshold,
    path: String = null,
    port: Int | Double = null
  ): HealthCheckPolicy = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold, intervalMillis = intervalMillis, protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis, unhealthyThreshold = unhealthyThreshold)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckPolicy]
  }
}

