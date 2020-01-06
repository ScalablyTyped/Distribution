package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequest extends js.Object {
  /**
    * If you specified a duration and your Spot Instance request was fulfilled, this is the fixed hourly price in effect for the Spot Instance while it runs.
    */
  var ActualBlockHourlyPrice: js.UndefOr[String] = js.native
  /**
    * The Availability Zone group. If you specify the same Availability Zone group for all Spot Instance requests, all Spot Instances are launched in the same Availability Zone.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.native
  /**
    * The duration for the Spot Instance, in minutes.
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  /**
    * The date and time when the Spot Instance request was created, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.native
  /**
    * The instance ID, if an instance has been launched to fulfill the Spot Instance request.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceInterruptionBehavior] = js.native
  /**
    * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
    */
  var LaunchGroup: js.UndefOr[String] = js.native
  /**
    * Additional information for launching instances.
    */
  var LaunchSpecification: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchSpecification] = js.native
  /**
    * The Availability Zone in which the request is launched.
    */
  var LaunchedAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The product description associated with the Spot Instance.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
  /**
    * The maximum price per hour that you are willing to pay for a Spot Instance.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Instance request. Spot status information helps track your Spot Instance requests. For more information, see Spot Status in the Amazon EC2 User Guide for Linux Instances.
    */
  var State: js.UndefOr[SpotInstanceState] = js.native
  /**
    * The status code and status message describing the Spot Instance request.
    */
  var Status: js.UndefOr[SpotInstanceStatus] = js.native
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The Spot Instance request type.
    */
  var Type: js.UndefOr[SpotInstanceType] = js.native
  /**
    * The start date of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The request becomes active at this date and time.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.native
  /**
    * The end date of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). If this is a one-time request, it remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date is reached. The default end date is 7 days from the current date.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.native
}

object SpotInstanceRequest {
  @scala.inline
  def apply(
    ActualBlockHourlyPrice: String = null,
    AvailabilityZoneGroup: String = null,
    BlockDurationMinutes: Int | scala.Double = null,
    CreateTime: DateTime = null,
    Fault: SpotInstanceStateFault = null,
    InstanceId: String = null,
    InstanceInterruptionBehavior: InstanceInterruptionBehavior = null,
    LaunchGroup: String = null,
    LaunchSpecification: LaunchSpecification = null,
    LaunchedAvailabilityZone: String = null,
    ProductDescription: RIProductDescription = null,
    SpotInstanceRequestId: String = null,
    SpotPrice: String = null,
    State: SpotInstanceState = null,
    Status: SpotInstanceStatus = null,
    Tags: TagList = null,
    Type: SpotInstanceType = null,
    ValidFrom: DateTime = null,
    ValidUntil: DateTime = null
  ): SpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (ActualBlockHourlyPrice != null) __obj.updateDynamic("ActualBlockHourlyPrice")(ActualBlockHourlyPrice.asInstanceOf[js.Any])
    if (AvailabilityZoneGroup != null) __obj.updateDynamic("AvailabilityZoneGroup")(AvailabilityZoneGroup.asInstanceOf[js.Any])
    if (BlockDurationMinutes != null) __obj.updateDynamic("BlockDurationMinutes")(BlockDurationMinutes.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (Fault != null) __obj.updateDynamic("Fault")(Fault.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceInterruptionBehavior != null) __obj.updateDynamic("InstanceInterruptionBehavior")(InstanceInterruptionBehavior.asInstanceOf[js.Any])
    if (LaunchGroup != null) __obj.updateDynamic("LaunchGroup")(LaunchGroup.asInstanceOf[js.Any])
    if (LaunchSpecification != null) __obj.updateDynamic("LaunchSpecification")(LaunchSpecification.asInstanceOf[js.Any])
    if (LaunchedAvailabilityZone != null) __obj.updateDynamic("LaunchedAvailabilityZone")(LaunchedAvailabilityZone.asInstanceOf[js.Any])
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription.asInstanceOf[js.Any])
    if (SpotInstanceRequestId != null) __obj.updateDynamic("SpotInstanceRequestId")(SpotInstanceRequestId.asInstanceOf[js.Any])
    if (SpotPrice != null) __obj.updateDynamic("SpotPrice")(SpotPrice.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom.asInstanceOf[js.Any])
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequest]
  }
}

