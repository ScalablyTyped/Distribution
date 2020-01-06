package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup extends js.Object {
  /**
    * The identifier (ID) of the backup.
    */
  var BackupId: typings.awsDashSdk.clientsCloudhsmv2Mod.BackupId = js.native
  /**
    * The state of the backup.
    */
  var BackupState: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.BackupState] = js.native
  /**
    * The identifier (ID) of the cluster that was backed up.
    */
  var ClusterId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.ClusterId] = js.native
  var CopyTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time when the backup was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time when the backup will be permanently deleted.
    */
  var DeleteTimestamp: js.UndefOr[Timestamp] = js.native
  var SourceBackup: js.UndefOr[BackupId] = js.native
  var SourceCluster: js.UndefOr[ClusterId] = js.native
  var SourceRegion: js.UndefOr[Region] = js.native
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
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    if (BackupState != null) __obj.updateDynamic("BackupState")(BackupState.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (CopyTimestamp != null) __obj.updateDynamic("CopyTimestamp")(CopyTimestamp.asInstanceOf[js.Any])
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp.asInstanceOf[js.Any])
    if (DeleteTimestamp != null) __obj.updateDynamic("DeleteTimestamp")(DeleteTimestamp.asInstanceOf[js.Any])
    if (SourceBackup != null) __obj.updateDynamic("SourceBackup")(SourceBackup.asInstanceOf[js.Any])
    if (SourceCluster != null) __obj.updateDynamic("SourceCluster")(SourceCluster.asInstanceOf[js.Any])
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
}

