package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSnapshotScheduleInput extends js.Object {
  /**
    * Optional description of the snapshot that overwrites the existing description.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Description] = js.undefined
  /**
    * Frequency of snapshots. Specify the number of hours between snapshots.
    */
  var RecurrenceInHours: typings.awsDashSdk.clientsStoragegatewayMod.RecurrenceInHours
  /**
    * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var StartAt: HourOfDay
  /**
    * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN
}

object UpdateSnapshotScheduleInput {
  @scala.inline
  def apply(
    RecurrenceInHours: RecurrenceInHours,
    StartAt: HourOfDay,
    VolumeARN: VolumeARN,
    Description: Description = null,
    Tags: Tags = null
  ): UpdateSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(RecurrenceInHours = RecurrenceInHours, StartAt = StartAt, VolumeARN = VolumeARN)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[UpdateSnapshotScheduleInput]
  }
}

