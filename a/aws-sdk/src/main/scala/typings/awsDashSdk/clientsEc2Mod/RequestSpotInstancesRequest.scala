package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSpotInstancesRequest extends js.Object {
  /**
    * The user-specified name for a logical grouping of requests. When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of Availability Zone is not. The group applies only to requests for Spot Instances of the same instance type. Any additional Spot Instance requests that are specified with the same Availability Zone group name are launched in that same Availability Zone, as long as at least one instance from the group is still active. If there is no active instance running in the Availability Zone group that you specify for a new Spot Instance request (all instances are terminated, the request is expired, or the maximum price you specified falls below current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be met. Consequently, the subsequent set of Spot Instances could be placed in a different zone from the original request, even if you specified the same Availability Zone group. Default: Instances are launched in any available Availability Zone.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.undefined
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360). The duration period starts as soon as your Spot Instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot Instance for termination and provides a Spot Instance termination notice, which gives the instance a two-minute warning before it terminates. You can't specify an Availability Zone group or a launch group if you specify a duration.
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.undefined
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency in the Amazon EC2 User Guide for Linux Instances.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of Spot Instances to launch. Default: 1
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceInterruptionBehavior] = js.undefined
  /**
    * The instance launch group. Launch groups are Spot Instances that launch together and terminate together. Default: Instances are launched and terminated individually
    */
  var LaunchGroup: js.UndefOr[String] = js.undefined
  /**
    * The launch specification.
    */
  var LaunchSpecification: js.UndefOr[RequestSpotLaunchSpecification] = js.undefined
  /**
    * The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
    */
  var SpotPrice: js.UndefOr[String] = js.undefined
  /**
    * The Spot Instance request type. Default: one-time 
    */
  var Type: js.UndefOr[SpotInstanceType] = js.undefined
  /**
    * The start date of the request. If this is a one-time request, the request becomes active at this date and time and remains active until all instances launch, the request expires, or the request is canceled. If the request is persistent, the request becomes active at this date and time and remains active until it expires or is canceled.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.undefined
  /**
    * The end date of the request. If this is a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date is reached. The default end date is 7 days from the current date.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}

object RequestSpotInstancesRequest {
  @scala.inline
  def apply(
    AvailabilityZoneGroup: String = null,
    BlockDurationMinutes: js.UndefOr[Integer] = js.undefined,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    InstanceCount: js.UndefOr[Integer] = js.undefined,
    InstanceInterruptionBehavior: InstanceInterruptionBehavior = null,
    LaunchGroup: String = null,
    LaunchSpecification: RequestSpotLaunchSpecification = null,
    SpotPrice: String = null,
    Type: SpotInstanceType = null,
    ValidFrom: DateTime = null,
    ValidUntil: DateTime = null
  ): RequestSpotInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZoneGroup != null) __obj.updateDynamic("AvailabilityZoneGroup")(AvailabilityZoneGroup)
    if (!js.isUndefined(BlockDurationMinutes)) __obj.updateDynamic("BlockDurationMinutes")(BlockDurationMinutes)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    if (InstanceInterruptionBehavior != null) __obj.updateDynamic("InstanceInterruptionBehavior")(InstanceInterruptionBehavior.asInstanceOf[js.Any])
    if (LaunchGroup != null) __obj.updateDynamic("LaunchGroup")(LaunchGroup)
    if (LaunchSpecification != null) __obj.updateDynamic("LaunchSpecification")(LaunchSpecification)
    if (SpotPrice != null) __obj.updateDynamic("SpotPrice")(SpotPrice)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom)
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil)
    __obj.asInstanceOf[RequestSpotInstancesRequest]
  }
}

