package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspaceSnapshotsRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId
}

object DescribeWorkspaceSnapshotsRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): DescribeWorkspaceSnapshotsRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId)
  
    __obj.asInstanceOf[DescribeWorkspaceSnapshotsRequest]
  }
}

