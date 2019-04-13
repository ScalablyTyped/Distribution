package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  /**
    * The time that the Dedicated Host was allocated.
    */
  var AllocationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Whether auto-placement is on or off.
    */
  var AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined
  /**
    * The Availability Zone of the Dedicated Host.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The number of new instances that can be launched onto the Dedicated Host.
    */
  var AvailableCapacity: js.UndefOr[AvailableCapacity] = js.undefined
  /**
    * Unique, case-sensitive identifier that you provide to ensure idempotency of the request. For more information, see How to Ensure Idempotency in the Amazon Elastic Compute Cloud User Guide. 
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Dedicated Host.
    */
  var HostId: js.UndefOr[String] = js.undefined
  /**
    * The hardware specifications of the Dedicated Host.
    */
  var HostProperties: js.UndefOr[HostProperties] = js.undefined
  /**
    * The reservation ID of the Dedicated Host. This returns a null response if the Dedicated Host doesn't have an associated reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.undefined
  /**
    * The IDs and instance type that are currently running on the Dedicated Host.
    */
  var Instances: js.UndefOr[HostInstanceList] = js.undefined
  /**
    * The time that the Dedicated Host was released.
    */
  var ReleaseTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The Dedicated Host's state.
    */
  var State: js.UndefOr[AllocationState] = js.undefined
  /**
    * Any tags assigned to the Dedicated Host.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object Host {
  @scala.inline
  def apply(
    AllocationTime: DateTime = null,
    AutoPlacement: AutoPlacement = null,
    AvailabilityZone: String = null,
    AvailableCapacity: AvailableCapacity = null,
    ClientToken: String = null,
    HostId: String = null,
    HostProperties: HostProperties = null,
    HostReservationId: String = null,
    Instances: HostInstanceList = null,
    ReleaseTime: DateTime = null,
    State: AllocationState = null,
    Tags: TagList = null
  ): Host = {
    val __obj = js.Dynamic.literal()
    if (AllocationTime != null) __obj.updateDynamic("AllocationTime")(AllocationTime)
    if (AutoPlacement != null) __obj.updateDynamic("AutoPlacement")(AutoPlacement.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (AvailableCapacity != null) __obj.updateDynamic("AvailableCapacity")(AvailableCapacity)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (HostId != null) __obj.updateDynamic("HostId")(HostId)
    if (HostProperties != null) __obj.updateDynamic("HostProperties")(HostProperties)
    if (HostReservationId != null) __obj.updateDynamic("HostReservationId")(HostReservationId)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (ReleaseTime != null) __obj.updateDynamic("ReleaseTime")(ReleaseTime)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[Host]
  }
}

