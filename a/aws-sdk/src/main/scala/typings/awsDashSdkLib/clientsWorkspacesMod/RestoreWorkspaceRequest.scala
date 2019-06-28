package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreWorkspaceRequest extends js.Object {
  /**
    * Indicates whether to create snapshots of the root volume and user volume before restoring the WorkSpace.
    */
  var SnapshotCurrentVolumes: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkspaceId
}

object RestoreWorkspaceRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, SnapshotCurrentVolumes: js.UndefOr[BooleanObject] = js.undefined): RestoreWorkspaceRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId)
    if (!js.isUndefined(SnapshotCurrentVolumes)) __obj.updateDynamic("SnapshotCurrentVolumes")(SnapshotCurrentVolumes)
    __obj.asInstanceOf[RestoreWorkspaceRequest]
  }
}

