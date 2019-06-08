package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotInfo extends js.Object {
  /**
    * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * Account id used when creating this snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Progress this snapshot has made towards completing.
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * Snapshot id that can be used to describe this snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
    */
  var StartTime: js.UndefOr[MillisecondDateTime] = js.undefined
  /**
    * Current state of the snapshot.
    */
  var State: js.UndefOr[SnapshotState] = js.undefined
  /**
    * Tags associated with this snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * Source volume from which this snapshot was created.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  /**
    * Size of the volume from which this snapshot was created.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
}

object SnapshotInfo {
  @scala.inline
  def apply(
    Description: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    OwnerId: String = null,
    Progress: String = null,
    SnapshotId: String = null,
    StartTime: MillisecondDateTime = null,
    State: SnapshotState = null,
    Tags: TagList = null,
    VolumeId: String = null,
    VolumeSize: js.UndefOr[Integer] = js.undefined
  ): SnapshotInfo = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize)
    __obj.asInstanceOf[SnapshotInfo]
  }
}

