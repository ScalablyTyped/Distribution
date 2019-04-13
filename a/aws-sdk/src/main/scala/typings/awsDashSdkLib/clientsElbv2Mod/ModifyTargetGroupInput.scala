package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTargetGroupInput extends js.Object {
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For Application Load Balancers, the range is 5–300 seconds. For Network Load Balancers, the supported values are 10 or 30 seconds. If the protocol of the target group is TCP, you can't modify this setting.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
  /**
    * [HTTP/HTTPS health checks] The ping path that is the destination for the health check request.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.undefined
  /**
    * The port the load balancer uses when performing health checks on targets.
    */
  var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
  /**
    * The protocol the load balancer uses when performing health checks on targets. The TCP protocol is supported for health checks only if the protocol of the target group is TCP or TLS. The TLS protocol is not supported for health checks. If the protocol of the target group is TCP, you can't modify this setting.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
  /**
    * [HTTP/HTTPS health checks] The amount of time, in seconds, during which no response means a failed health check. If the protocol of the target group is TCP, you can't modify this setting.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  /**
    * [HTTP/HTTPS health checks] The HTTP codes to use when checking for a successful response from a target. If the protocol of the target group is TCP, you can't modify this setting.
    */
  var Matcher: js.UndefOr[Matcher] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: awsDashSdkLib.clientsElbv2Mod.TargetGroupArn
  /**
    * The number of consecutive health check failures required before considering the target unhealthy. For Network Load Balancers, this value must be the same as the healthy threshold count.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
}

object ModifyTargetGroupInput {
  @scala.inline
  def apply(
    TargetGroupArn: TargetGroupArn,
    HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined,
    HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
    HealthCheckPath: Path = null,
    HealthCheckPort: HealthCheckPort = null,
    HealthCheckProtocol: ProtocolEnum = null,
    HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
    HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
    Matcher: Matcher = null,
    UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  ): ModifyTargetGroupInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn)
    if (!js.isUndefined(HealthCheckEnabled)) __obj.updateDynamic("HealthCheckEnabled")(HealthCheckEnabled)
    if (!js.isUndefined(HealthCheckIntervalSeconds)) __obj.updateDynamic("HealthCheckIntervalSeconds")(HealthCheckIntervalSeconds)
    if (HealthCheckPath != null) __obj.updateDynamic("HealthCheckPath")(HealthCheckPath)
    if (HealthCheckPort != null) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort)
    if (HealthCheckProtocol != null) __obj.updateDynamic("HealthCheckProtocol")(HealthCheckProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(HealthCheckTimeoutSeconds)) __obj.updateDynamic("HealthCheckTimeoutSeconds")(HealthCheckTimeoutSeconds)
    if (!js.isUndefined(HealthyThresholdCount)) __obj.updateDynamic("HealthyThresholdCount")(HealthyThresholdCount)
    if (Matcher != null) __obj.updateDynamic("Matcher")(Matcher)
    if (!js.isUndefined(UnhealthyThresholdCount)) __obj.updateDynamic("UnhealthyThresholdCount")(UnhealthyThresholdCount)
    __obj.asInstanceOf[ModifyTargetGroupInput]
  }
}

