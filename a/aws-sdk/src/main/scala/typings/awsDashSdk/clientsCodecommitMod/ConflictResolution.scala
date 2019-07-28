package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictResolution extends js.Object {
  /**
    * Files that will be deleted as part of the merge conflict resolution.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.undefined
  /**
    * Files that will have content replaced as part of the merge conflict resolution.
    */
  var replaceContents: js.UndefOr[ReplaceContentEntries] = js.undefined
  /**
    * File modes that will be set as part of the merge conflict resolution.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.undefined
}

object ConflictResolution {
  @scala.inline
  def apply(
    deleteFiles: DeleteFileEntries = null,
    replaceContents: ReplaceContentEntries = null,
    setFileModes: SetFileModeEntries = null
  ): ConflictResolution = {
    val __obj = js.Dynamic.literal()
    if (deleteFiles != null) __obj.updateDynamic("deleteFiles")(deleteFiles)
    if (replaceContents != null) __obj.updateDynamic("replaceContents")(replaceContents)
    if (setFileModes != null) __obj.updateDynamic("setFileModes")(setFileModes)
    __obj.asInstanceOf[ConflictResolution]
  }
}

