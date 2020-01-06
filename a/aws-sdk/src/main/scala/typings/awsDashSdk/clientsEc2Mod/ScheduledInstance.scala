package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstance extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The date when the Scheduled Instance was purchased.
    */
  var CreateDate: js.UndefOr[DateTime] = js.native
  /**
    * The hourly price for a single instance.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The number of instances.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The network platform (EC2-Classic or EC2-VPC).
    */
  var NetworkPlatform: js.UndefOr[String] = js.native
  /**
    * The time for the next schedule to start.
    */
  var NextSlotStartTime: js.UndefOr[DateTime] = js.native
  /**
    * The platform (Linux/UNIX or Windows).
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The time that the previous schedule ended or will end.
    */
  var PreviousSlotEndTime: js.UndefOr[DateTime] = js.native
  /**
    * The schedule recurrence.
    */
  var Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.native
  /**
    * The Scheduled Instance ID.
    */
  var ScheduledInstanceId: js.UndefOr[String] = js.native
  /**
    * The number of hours in the schedule.
    */
  var SlotDurationInHours: js.UndefOr[Integer] = js.native
  /**
    * The end date for the Scheduled Instance.
    */
  var TermEndDate: js.UndefOr[DateTime] = js.native
  /**
    * The start date for the Scheduled Instance.
    */
  var TermStartDate: js.UndefOr[DateTime] = js.native
  /**
    * The total number of hours for a single instance for the entire term.
    */
  var TotalScheduledInstanceHours: js.UndefOr[Integer] = js.native
}

object ScheduledInstance {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    CreateDate: DateTime = null,
    HourlyPrice: String = null,
    InstanceCount: Int | scala.Double = null,
    InstanceType: String = null,
    NetworkPlatform: String = null,
    NextSlotStartTime: DateTime = null,
    Platform: String = null,
    PreviousSlotEndTime: DateTime = null,
    Recurrence: ScheduledInstanceRecurrence = null,
    ScheduledInstanceId: String = null,
    SlotDurationInHours: Int | scala.Double = null,
    TermEndDate: DateTime = null,
    TermStartDate: DateTime = null,
    TotalScheduledInstanceHours: Int | scala.Double = null
  ): ScheduledInstance = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice.asInstanceOf[js.Any])
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (NetworkPlatform != null) __obj.updateDynamic("NetworkPlatform")(NetworkPlatform.asInstanceOf[js.Any])
    if (NextSlotStartTime != null) __obj.updateDynamic("NextSlotStartTime")(NextSlotStartTime.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PreviousSlotEndTime != null) __obj.updateDynamic("PreviousSlotEndTime")(PreviousSlotEndTime.asInstanceOf[js.Any])
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence.asInstanceOf[js.Any])
    if (ScheduledInstanceId != null) __obj.updateDynamic("ScheduledInstanceId")(ScheduledInstanceId.asInstanceOf[js.Any])
    if (SlotDurationInHours != null) __obj.updateDynamic("SlotDurationInHours")(SlotDurationInHours.asInstanceOf[js.Any])
    if (TermEndDate != null) __obj.updateDynamic("TermEndDate")(TermEndDate.asInstanceOf[js.Any])
    if (TermStartDate != null) __obj.updateDynamic("TermStartDate")(TermStartDate.asInstanceOf[js.Any])
    if (TotalScheduledInstanceHours != null) __obj.updateDynamic("TotalScheduledInstanceHours")(TotalScheduledInstanceHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstance]
  }
}

