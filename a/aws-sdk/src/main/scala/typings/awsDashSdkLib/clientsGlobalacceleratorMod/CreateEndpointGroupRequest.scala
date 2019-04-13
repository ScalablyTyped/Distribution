package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointGroupRequest extends js.Object {
  /**
    * The list of endpoint objects.
    */
  var EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined
  /**
    * The name of the AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific Region.
    */
  var EndpointGroupRegion: GenericString
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: awsDashSdkLib.clientsGlobalacceleratorMod.IdempotencyToken
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
}

object CreateEndpointGroupRequest {
  @scala.inline
  def apply(
    EndpointGroupRegion: GenericString,
    IdempotencyToken: IdempotencyToken,
    ListenerArn: GenericString,
    EndpointConfigurations: EndpointConfigurations = null,
    HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
    HealthCheckPath: GenericString = null,
    HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
    HealthCheckProtocol: HealthCheckProtocol = null,
    ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
    TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
  ): CreateEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupRegion = EndpointGroupRegion, IdempotencyToken = IdempotencyToken, ListenerArn = ListenerArn)
    if (EndpointConfigurations != null) __obj.updateDynamic("EndpointConfigurations")(EndpointConfigurations)
    if (!js.isUndefined(HealthCheckIntervalSeconds)) __obj.updateDynamic("HealthCheckIntervalSeconds")(HealthCheckIntervalSeconds)
    if (HealthCheckPath != null) __obj.updateDynamic("HealthCheckPath")(HealthCheckPath)
    if (!js.isUndefined(HealthCheckPort)) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort)
    if (HealthCheckProtocol != null) __obj.updateDynamic("HealthCheckProtocol")(HealthCheckProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(ThresholdCount)) __obj.updateDynamic("ThresholdCount")(ThresholdCount)
    if (!js.isUndefined(TrafficDialPercentage)) __obj.updateDynamic("TrafficDialPercentage")(TrafficDialPercentage)
    __obj.asInstanceOf[CreateEndpointGroupRequest]
  }
}

