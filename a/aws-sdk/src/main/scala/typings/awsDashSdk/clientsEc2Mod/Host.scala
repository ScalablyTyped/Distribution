package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host extends js.Object {
  /**
    * The time that the Dedicated Host was allocated.
    */
  var AllocationTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific instance type only. one indicates that the Dedicated Host supports multiple instance types in the instance family. off indicates that the Dedicated Host supports a single instance type only.
    */
  var AllowsMultipleInstanceTypes: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.AllowsMultipleInstanceTypes] = js.native
  /**
    * Whether auto-placement is on or off.
    */
  var AutoPlacement: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.AutoPlacement] = js.native
  /**
    * The Availability Zone of the Dedicated Host.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The ID of the Availability Zone in which the Dedicated Host is allocated.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * Information about the instances running on the Dedicated Host.
    */
  var AvailableCapacity: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.AvailableCapacity] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Dedicated Host.
    */
  var HostId: js.UndefOr[String] = js.native
  /**
    * The hardware specifications of the Dedicated Host.
    */
  var HostProperties: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.HostProperties] = js.native
  /**
    * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
    */
  var HostRecovery: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.HostRecovery] = js.native
  /**
    * The reservation ID of the Dedicated Host. This returns a null response if the Dedicated Host doesn't have an associated reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  /**
    * The IDs and instance type that are currently running on the Dedicated Host.
    */
  var Instances: js.UndefOr[HostInstanceList] = js.native
  /**
    * Indicates whether the Dedicated Host is in a host resource group. If memberOfServiceLinkedResourceGroup is true, the host is in a host resource group; otherwise, it is not.
    */
  var MemberOfServiceLinkedResourceGroup: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AWS account that owns the Dedicated Host.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The time that the Dedicated Host was released.
    */
  var ReleaseTime: js.UndefOr[DateTime] = js.native
  /**
    * The Dedicated Host's state.
    */
  var State: js.UndefOr[AllocationState] = js.native
  /**
    * Any tags assigned to the Dedicated Host.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Host {
  @scala.inline
  def apply(
    AllocationTime: DateTime = null,
    AllowsMultipleInstanceTypes: AllowsMultipleInstanceTypes = null,
    AutoPlacement: AutoPlacement = null,
    AvailabilityZone: String = null,
    AvailabilityZoneId: String = null,
    AvailableCapacity: AvailableCapacity = null,
    ClientToken: String = null,
    HostId: String = null,
    HostProperties: HostProperties = null,
    HostRecovery: HostRecovery = null,
    HostReservationId: String = null,
    Instances: HostInstanceList = null,
    MemberOfServiceLinkedResourceGroup: js.UndefOr[scala.Boolean] = js.undefined,
    OwnerId: String = null,
    ReleaseTime: DateTime = null,
    State: AllocationState = null,
    Tags: TagList = null
  ): Host = {
    val __obj = js.Dynamic.literal()
    if (AllocationTime != null) __obj.updateDynamic("AllocationTime")(AllocationTime.asInstanceOf[js.Any])
    if (AllowsMultipleInstanceTypes != null) __obj.updateDynamic("AllowsMultipleInstanceTypes")(AllowsMultipleInstanceTypes.asInstanceOf[js.Any])
    if (AutoPlacement != null) __obj.updateDynamic("AutoPlacement")(AutoPlacement.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId.asInstanceOf[js.Any])
    if (AvailableCapacity != null) __obj.updateDynamic("AvailableCapacity")(AvailableCapacity.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (HostId != null) __obj.updateDynamic("HostId")(HostId.asInstanceOf[js.Any])
    if (HostProperties != null) __obj.updateDynamic("HostProperties")(HostProperties.asInstanceOf[js.Any])
    if (HostRecovery != null) __obj.updateDynamic("HostRecovery")(HostRecovery.asInstanceOf[js.Any])
    if (HostReservationId != null) __obj.updateDynamic("HostReservationId")(HostReservationId.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (!js.isUndefined(MemberOfServiceLinkedResourceGroup)) __obj.updateDynamic("MemberOfServiceLinkedResourceGroup")(MemberOfServiceLinkedResourceGroup.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (ReleaseTime != null) __obj.updateDynamic("ReleaseTime")(ReleaseTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

