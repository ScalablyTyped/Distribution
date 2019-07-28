package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteClusterSnapshotsResult extends js.Object {
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.undefined
  /**
    * A list of the snapshot identifiers that were deleted. 
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
}

object BatchDeleteClusterSnapshotsResult {
  @scala.inline
  def apply(Errors: BatchSnapshotOperationErrorList = null, Resources: SnapshotIdentifierList = null): BatchDeleteClusterSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsResult]
  }
}

