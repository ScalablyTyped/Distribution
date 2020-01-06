package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointGroupRequest extends js.Object {
  /**
    * The list of endpoint objects.
    */
  var EndpointConfigurations: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.EndpointConfigurations] = js.native
  /**
    * The name of the AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific Region.
    */
  var EndpointGroupRegion: GenericString = js.native
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.HealthCheckIntervalSeconds] = js.native
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.native
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  var HealthCheckPort: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.HealthCheckPort] = js.native
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.HealthCheckProtocol] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: typings.awsDashSdk.clientsGlobalacceleratorMod.IdempotencyToken = js.native
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString = js.native
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.ThresholdCount] = js.native
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.TrafficDialPercentage] = js.native
}

object CreateEndpointGroupRequest {
  @scala.inline
  def apply(
    EndpointGroupRegion: GenericString,
    IdempotencyToken: IdempotencyToken,
    ListenerArn: GenericString,
    EndpointConfigurations: EndpointConfigurations = null,
    HealthCheckIntervalSeconds: Int | Double = null,
    HealthCheckPath: GenericString = null,
    HealthCheckPort: Int | Double = null,
    HealthCheckProtocol: HealthCheckProtocol = null,
    ThresholdCount: Int | Double = null,
    TrafficDialPercentage: Int | Double = null
  ): CreateEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupRegion = EndpointGroupRegion.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
    if (EndpointConfigurations != null) __obj.updateDynamic("EndpointConfigurations")(EndpointConfigurations.asInstanceOf[js.Any])
    if (HealthCheckIntervalSeconds != null) __obj.updateDynamic("HealthCheckIntervalSeconds")(HealthCheckIntervalSeconds.asInstanceOf[js.Any])
    if (HealthCheckPath != null) __obj.updateDynamic("HealthCheckPath")(HealthCheckPath.asInstanceOf[js.Any])
    if (HealthCheckPort != null) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort.asInstanceOf[js.Any])
    if (HealthCheckProtocol != null) __obj.updateDynamic("HealthCheckProtocol")(HealthCheckProtocol.asInstanceOf[js.Any])
    if (ThresholdCount != null) __obj.updateDynamic("ThresholdCount")(ThresholdCount.asInstanceOf[js.Any])
    if (TrafficDialPercentage != null) __obj.updateDynamic("TrafficDialPercentage")(TrafficDialPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointGroupRequest]
  }
}

