package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backup extends js.Object {
  /**
    * The identifier (ID) of the backup.
    */
  var BackupId: typings.awsDashSdk.clientsCloudhsmv2Mod.BackupId
  /**
    * The state of the backup.
    */
  var BackupState: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.BackupState] = js.undefined
  /**
    * The identifier (ID) of the cluster that was backed up.
    */
  var ClusterId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.ClusterId] = js.undefined
  var CopyTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time when the backup was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time when the backup will be permanently deleted.
    */
  var DeleteTimestamp: js.UndefOr[Timestamp] = js.undefined
  var SourceBackup: js.UndefOr[BackupId] = js.undefined
  var SourceCluster: js.UndefOr[ClusterId] = js.undefined
  var SourceRegion: js.UndefOr[Region] = js.undefined
}

object Backup {
  @scala.inline
  def apply(
    BackupId: BackupId,
    BackupState: BackupState = null,
    ClusterId: ClusterId = null,
    CopyTimestamp: Timestamp = null,
    CreateTimestamp: Timestamp = null,
    DeleteTimestamp: Timestamp = null,
    SourceBackup: BackupId = null,
    SourceCluster: ClusterId = null,
    SourceRegion: Region = null
  ): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId)
    if (BackupState != null) __obj.updateDynamic("BackupState")(BackupState.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (CopyTimestamp != null) __obj.updateDynamic("CopyTimestamp")(CopyTimestamp)
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp)
    if (DeleteTimestamp != null) __obj.updateDynamic("DeleteTimestamp")(DeleteTimestamp)
    if (SourceBackup != null) __obj.updateDynamic("SourceBackup")(SourceBackup)
    if (SourceCluster != null) __obj.updateDynamic("SourceCluster")(SourceCluster)
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion)
    __obj.asInstanceOf[Backup]
  }
}

