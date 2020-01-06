package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConflictResolution extends js.Object {
  /**
    * Files to be deleted as part of the merge conflict resolution.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.native
  /**
    * Files to have content replaced as part of the merge conflict resolution.
    */
  var replaceContents: js.UndefOr[ReplaceContentEntries] = js.native
  /**
    * File modes that are set as part of the merge conflict resolution.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.native
}

object ConflictResolution {
  @scala.inline
  def apply(
    deleteFiles: DeleteFileEntries = null,
    replaceContents: ReplaceContentEntries = null,
    setFileModes: SetFileModeEntries = null
  ): ConflictResolution = {
    val __obj = js.Dynamic.literal()
    if (deleteFiles != null) __obj.updateDynamic("deleteFiles")(deleteFiles.asInstanceOf[js.Any])
    if (replaceContents != null) __obj.updateDynamic("replaceContents")(replaceContents.asInstanceOf[js.Any])
    if (setFileModes != null) __obj.updateDynamic("setFileModes")(setFileModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConflictResolution]
  }
}

