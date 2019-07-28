package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conflict extends js.Object {
  /**
    * Metadata about a conflict in a merge operation.
    */
  var conflictMetadata: js.UndefOr[ConflictMetadata] = js.undefined
  /**
    * A list of hunks that contain the differences between files or lines causing the conflict.
    */
  var mergeHunks: js.UndefOr[MergeHunks] = js.undefined
}

object Conflict {
  @scala.inline
  def apply(conflictMetadata: ConflictMetadata = null, mergeHunks: MergeHunks = null): Conflict = {
    val __obj = js.Dynamic.literal()
    if (conflictMetadata != null) __obj.updateDynamic("conflictMetadata")(conflictMetadata)
    if (mergeHunks != null) __obj.updateDynamic("mergeHunks")(mergeHunks)
    __obj.asInstanceOf[Conflict]
  }
}

