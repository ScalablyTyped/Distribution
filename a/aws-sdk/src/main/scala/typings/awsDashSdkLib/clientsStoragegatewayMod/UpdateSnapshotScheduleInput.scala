package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSnapshotScheduleInput extends js.Object {
  /**
    * Optional description of the snapshot that overwrites the existing description.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * Frequency of snapshots. Specify the number of hours between snapshots.
    */
  var RecurrenceInHours: awsDashSdkLib.clientsStoragegatewayMod.RecurrenceInHours
  /**
    * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var StartAt: HourOfDay
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.VolumeARN
}

object UpdateSnapshotScheduleInput {
  @scala.inline
  def apply(
    RecurrenceInHours: RecurrenceInHours,
    StartAt: HourOfDay,
    VolumeARN: VolumeARN,
    Description: Description = null
  ): UpdateSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(RecurrenceInHours = RecurrenceInHours, StartAt = StartAt, VolumeARN = VolumeARN)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateSnapshotScheduleInput]
  }
}

