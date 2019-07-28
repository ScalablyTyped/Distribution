package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledInstance extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The date when the Scheduled Instance was purchased.
    */
  var CreateDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The hourly price for a single instance.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  /**
    * The number of instances.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The network platform (EC2-Classic or EC2-VPC).
    */
  var NetworkPlatform: js.UndefOr[String] = js.undefined
  /**
    * The time for the next schedule to start.
    */
  var NextSlotStartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The platform (Linux/UNIX or Windows).
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * The time that the previous schedule ended or will end.
    */
  var PreviousSlotEndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The schedule recurrence.
    */
  var Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.undefined
  /**
    * The Scheduled Instance ID.
    */
  var ScheduledInstanceId: js.UndefOr[String] = js.undefined
  /**
    * The number of hours in the schedule.
    */
  var SlotDurationInHours: js.UndefOr[Integer] = js.undefined
  /**
    * The end date for the Scheduled Instance.
    */
  var TermEndDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The start date for the Scheduled Instance.
    */
  var TermStartDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The total number of hours for a single instance for the entire term.
    */
  var TotalScheduledInstanceHours: js.UndefOr[Integer] = js.undefined
}

object ScheduledInstance {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    CreateDate: DateTime = null,
    HourlyPrice: String = null,
    InstanceCount: js.UndefOr[Integer] = js.undefined,
    InstanceType: String = null,
    NetworkPlatform: String = null,
    NextSlotStartTime: DateTime = null,
    Platform: String = null,
    PreviousSlotEndTime: DateTime = null,
    Recurrence: ScheduledInstanceRecurrence = null,
    ScheduledInstanceId: String = null,
    SlotDurationInHours: js.UndefOr[Integer] = js.undefined,
    TermEndDate: DateTime = null,
    TermStartDate: DateTime = null,
    TotalScheduledInstanceHours: js.UndefOr[Integer] = js.undefined
  ): ScheduledInstance = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (NetworkPlatform != null) __obj.updateDynamic("NetworkPlatform")(NetworkPlatform)
    if (NextSlotStartTime != null) __obj.updateDynamic("NextSlotStartTime")(NextSlotStartTime)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (PreviousSlotEndTime != null) __obj.updateDynamic("PreviousSlotEndTime")(PreviousSlotEndTime)
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence)
    if (ScheduledInstanceId != null) __obj.updateDynamic("ScheduledInstanceId")(ScheduledInstanceId)
    if (!js.isUndefined(SlotDurationInHours)) __obj.updateDynamic("SlotDurationInHours")(SlotDurationInHours)
    if (TermEndDate != null) __obj.updateDynamic("TermEndDate")(TermEndDate)
    if (TermStartDate != null) __obj.updateDynamic("TermStartDate")(TermStartDate)
    if (!js.isUndefined(TotalScheduledInstanceHours)) __obj.updateDynamic("TotalScheduledInstanceHours")(TotalScheduledInstanceHours)
    __obj.asInstanceOf[ScheduledInstance]
  }
}

