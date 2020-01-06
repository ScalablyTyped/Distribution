package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointGroup extends js.Object {
  /**
    * The list of endpoint objects.
    */
  var EndpointDescriptions: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.EndpointDescriptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region that this endpoint group belongs.
    */
  var EndpointGroupRegion: js.UndefOr[GenericString] = js.native
  /**
    * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.HealthCheckIntervalSeconds] = js.native
  /**
    * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the destination on the endpoints for health checks. The default is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.native
  /**
    * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.  The default port is the port for the listener that this endpoint group is associated with. If the listener port is a list, Global Accelerator uses the first specified port in the list of ports.
    */
  var HealthCheckPort: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.HealthCheckPort] = js.native
  /**
    * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.HealthCheckProtocol] = js.native
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.ThresholdCount] = js.native
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.TrafficDialPercentage] = js.native
}

object EndpointGroup {
  @scala.inline
  def apply(
    EndpointDescriptions: EndpointDescriptions = null,
    EndpointGroupArn: GenericString = null,
    EndpointGroupRegion: GenericString = null,
    HealthCheckIntervalSeconds: Int | Double = null,
    HealthCheckPath: GenericString = null,
    HealthCheckPort: Int | Double = null,
    HealthCheckProtocol: HealthCheckProtocol = null,
    ThresholdCount: Int | Double = null,
    TrafficDialPercentage: Int | Double = null
  ): EndpointGroup = {
    val __obj = js.Dynamic.literal()
    if (EndpointDescriptions != null) __obj.updateDynamic("EndpointDescriptions")(EndpointDescriptions.asInstanceOf[js.Any])
    if (EndpointGroupArn != null) __obj.updateDynamic("EndpointGroupArn")(EndpointGroupArn.asInstanceOf[js.Any])
    if (EndpointGroupRegion != null) __obj.updateDynamic("EndpointGroupRegion")(EndpointGroupRegion.asInstanceOf[js.Any])
    if (HealthCheckIntervalSeconds != null) __obj.updateDynamic("HealthCheckIntervalSeconds")(HealthCheckIntervalSeconds.asInstanceOf[js.Any])
    if (HealthCheckPath != null) __obj.updateDynamic("HealthCheckPath")(HealthCheckPath.asInstanceOf[js.Any])
    if (HealthCheckPort != null) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort.asInstanceOf[js.Any])
    if (HealthCheckProtocol != null) __obj.updateDynamic("HealthCheckProtocol")(HealthCheckProtocol.asInstanceOf[js.Any])
    if (ThresholdCount != null) __obj.updateDynamic("ThresholdCount")(ThresholdCount.asInstanceOf[js.Any])
    if (TrafficDialPercentage != null) __obj.updateDynamic("TrafficDialPercentage")(TrafficDialPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointGroup]
  }
}

