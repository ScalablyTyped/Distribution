package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupResponse extends js.Object {
  /**
    * The ID of the backup deleted.
    */
  var BackupId: js.UndefOr[typings.awsDashSdk.clientsFsxMod.BackupId] = js.undefined
  /**
    * The lifecycle of the backup. Should be DELETED.
    */
  var Lifecycle: js.UndefOr[BackupLifecycle] = js.undefined
}

object DeleteBackupResponse {
  @scala.inline
  def apply(BackupId: BackupId = null, Lifecycle: BackupLifecycle = null): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (BackupId != null) __obj.updateDynamic("BackupId")(BackupId)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupResponse]
  }
}

