package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSnapshotResult extends js.Object {
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * Information about the import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.SnapshotTaskDetail] = js.native
}

object ImportSnapshotResult {
  @scala.inline
  def apply(
    Description: String = null,
    ImportTaskId: String = null,
    SnapshotTaskDetail: SnapshotTaskDetail = null
  ): ImportSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId.asInstanceOf[js.Any])
    if (SnapshotTaskDetail != null) __obj.updateDynamic("SnapshotTaskDetail")(SnapshotTaskDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSnapshotResult]
  }
}

