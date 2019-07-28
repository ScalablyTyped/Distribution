package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
  /**
    * A list of any errors returned.
    */
  var Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.undefined
  /**
    * A list of the snapshots that were modified.
    */
  var Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
}

object BatchModifyClusterSnapshotsOutputMessage {
  @scala.inline
  def apply(Errors: BatchSnapshotOperationErrors = null, Resources: SnapshotIdentifierList = null): BatchModifyClusterSnapshotsOutputMessage = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    __obj.asInstanceOf[BatchModifyClusterSnapshotsOutputMessage]
  }
}

