package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceSnapshotsRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId = js.native
}

object DescribeWorkspaceSnapshotsRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): DescribeWorkspaceSnapshotsRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeWorkspaceSnapshotsRequest]
  }
}

