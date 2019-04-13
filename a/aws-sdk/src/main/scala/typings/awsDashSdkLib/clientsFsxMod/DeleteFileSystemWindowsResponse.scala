package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileSystemWindowsResponse extends js.Object {
  /**
    * The ID of the final backup for this file system.
    */
  var FinalBackupId: js.UndefOr[BackupId] = js.undefined
  /**
    * The set of tags applied to the final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
}

object DeleteFileSystemWindowsResponse {
  @scala.inline
  def apply(FinalBackupId: BackupId = null, FinalBackupTags: Tags = null): DeleteFileSystemWindowsResponse = {
    val __obj = js.Dynamic.literal()
    if (FinalBackupId != null) __obj.updateDynamic("FinalBackupId")(FinalBackupId)
    if (FinalBackupTags != null) __obj.updateDynamic("FinalBackupTags")(FinalBackupTags)
    __obj.asInstanceOf[DeleteFileSystemWindowsResponse]
  }
}

