package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotScheduleOutput extends js.Object {
  /**
    * The snapshot description.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The number of hours between snapshots.
    */
  var RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined
  /**
    * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var StartAt: js.UndefOr[HourOfDay] = js.undefined
  /**
    * A value that indicates the time zone of the gateway.
    */
  var Timezone: js.UndefOr[GatewayTimezone] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the volume that was specified in the request.
    */
  var VolumeARN: js.UndefOr[VolumeARN] = js.undefined
}

object DescribeSnapshotScheduleOutput {
  @scala.inline
  def apply(
    Description: Description = null,
    RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined,
    StartAt: js.UndefOr[HourOfDay] = js.undefined,
    Timezone: GatewayTimezone = null,
    VolumeARN: VolumeARN = null
  ): DescribeSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(RecurrenceInHours)) __obj.updateDynamic("RecurrenceInHours")(RecurrenceInHours)
    if (!js.isUndefined(StartAt)) __obj.updateDynamic("StartAt")(StartAt)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    __obj.asInstanceOf[DescribeSnapshotScheduleOutput]
  }
}

