package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointGroup extends js.Object {
  /**
    * The list of endpoint objects.
    */
  var EndpointDescriptions: js.UndefOr[EndpointDescriptions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
  /**
    * The AWS Region that this endpoint group belongs.
    */
  var EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined
  /**
    * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
  /**
    * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the destination on the endpoints for health checks. The default is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
  /**
    * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.  The default port is the port for the listener that this endpoint group is associated with. If the listener port is a list, Global Accelerator uses the first specified port in the list of ports.
    */
  var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
  /**
    * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
}

object EndpointGroup {
  @scala.inline
  def apply(
    EndpointDescriptions: EndpointDescriptions = null,
    EndpointGroupArn: GenericString = null,
    EndpointGroupRegion: GenericString = null,
    HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
    HealthCheckPath: GenericString = null,
    HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
    HealthCheckProtocol: HealthCheckProtocol = null,
    ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
    TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
  ): EndpointGroup = {
    val __obj = js.Dynamic.literal()
    if (EndpointDescriptions != null) __obj.updateDynamic("EndpointDescriptions")(EndpointDescriptions)
    if (EndpointGroupArn != null) __obj.updateDynamic("EndpointGroupArn")(EndpointGroupArn)
    if (EndpointGroupRegion != null) __obj.updateDynamic("EndpointGroupRegion")(EndpointGroupRegion)
    if (!js.isUndefined(HealthCheckIntervalSeconds)) __obj.updateDynamic("HealthCheckIntervalSeconds")(HealthCheckIntervalSeconds)
    if (HealthCheckPath != null) __obj.updateDynamic("HealthCheckPath")(HealthCheckPath)
    if (!js.isUndefined(HealthCheckPort)) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort)
    if (HealthCheckProtocol != null) __obj.updateDynamic("HealthCheckProtocol")(HealthCheckProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(ThresholdCount)) __obj.updateDynamic("ThresholdCount")(ThresholdCount)
    if (!js.isUndefined(TrafficDialPercentage)) __obj.updateDynamic("TrafficDialPercentage")(TrafficDialPercentage)
    __obj.asInstanceOf[EndpointGroup]
  }
}

