package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTargetGroupInput extends js.Object {
  /**
    * Indicates whether health checks are enabled. If the target type is instance or ip, the default is true. If the target type is lambda, the default is false.
    */
  var HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For Application Load Balancers, the range is 5–300 seconds. For Network Load Balancers, the supported values are 10 or 30 seconds. If the target type is instance or ip, the default is 30 seconds. If the target type is lambda, the default is 35 seconds.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
  /**
    * [HTTP/HTTPS health checks] The ping path that is the destination on the targets for health checks. The default is /.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.undefined
  /**
    * The port the load balancer uses when performing health checks on targets. The default is traffic-port, which is the port on which each target receives traffic from the load balancer.
    */
  var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
  /**
    * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the default is HTTP. For Network Load Balancers, the default is TCP. The TCP protocol is supported for health checks only if the protocol of the target group is TCP or TLS. The TLS protocol is not supported for health checks.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
  /**
    * The amount of time, in seconds, during which no response from a target means a failed health check. For Application Load Balancers, the range is 2–120 seconds and the default is 5 seconds if the target type is instance or ip and 30 seconds if the target type is lambda. For Network Load Balancers, this is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy. For Application Load Balancers, the default is 5. For Network Load Balancers, the default is 3.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  /**
    * [HTTP/HTTPS health checks] The HTTP codes to use when checking for a successful response from a target.
    */
  var Matcher: js.UndefOr[Matcher] = js.undefined
  /**
    * The name of the target group. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
    */
  var Name: TargetGroupName
  /**
    * The port on which the targets receive traffic. This port is used unless you specify a port override when registering the target. If the target is a Lambda function, this parameter does not apply.
    */
  var Port: js.UndefOr[Port] = js.undefined
  /**
    * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP and TLS. If the target is a Lambda function, this parameter does not apply.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  /**
    * The type of target that you must specify when registering targets with this target group. You can't specify targets for a target group using more than one target type.    instance - Targets are specified by instance ID. This is the default value.    ip - Targets are specified by IP address. You can specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.    lambda - The target groups contains a single Lambda function.  
    */
  var TargetType: js.UndefOr[TargetTypeEnum] = js.undefined
  /**
    * The number of consecutive health check failures required before considering a target unhealthy. For Application Load Balancers, the default is 2. For Network Load Balancers, this value must be the same as the healthy threshold count.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  /**
    * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not apply.
    */
  var VpcId: js.UndefOr[VpcId] = js.undefined
}

object CreateTargetGroupInput {
  @scala.inline
  def apply(
    Name: TargetGroupName,
    HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined,
    HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
    HealthCheckPath: Path = null,
    HealthCheckPort: HealthCheckPort = null,
    HealthCheckProtocol: ProtocolEnum = null,
    HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
    HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
    Matcher: Matcher = null,
    Port: js.UndefOr[Port] = js.undefined,
    Protocol: ProtocolEnum = null,
    TargetType: TargetTypeEnum = null,
    UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
    VpcId: VpcId = null
  ): CreateTargetGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(HealthCheckEnabled)) __obj.updateDynamic("HealthCheckEnabled")(HealthCheckEnabled)
    if (!js.isUndefined(HealthCheckIntervalSeconds)) __obj.updateDynamic("HealthCheckIntervalSeconds")(HealthCheckIntervalSeconds)
    if (HealthCheckPath != null) __obj.updateDynamic("HealthCheckPath")(HealthCheckPath)
    if (HealthCheckPort != null) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort)
    if (HealthCheckProtocol != null) __obj.updateDynamic("HealthCheckProtocol")(HealthCheckProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(HealthCheckTimeoutSeconds)) __obj.updateDynamic("HealthCheckTimeoutSeconds")(HealthCheckTimeoutSeconds)
    if (!js.isUndefined(HealthyThresholdCount)) __obj.updateDynamic("HealthyThresholdCount")(HealthyThresholdCount)
    if (Matcher != null) __obj.updateDynamic("Matcher")(Matcher)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    if (!js.isUndefined(UnhealthyThresholdCount)) __obj.updateDynamic("UnhealthyThresholdCount")(UnhealthyThresholdCount)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[CreateTargetGroupInput]
  }
}

