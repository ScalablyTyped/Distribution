package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
    */
  var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
}

object DescribeWorkspacesConnectionStatusRequest {
  @scala.inline
  def apply(NextToken: PaginationToken = null, WorkspaceIds: WorkspaceIdList = null): DescribeWorkspacesConnectionStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WorkspaceIds != null) __obj.updateDynamic("WorkspaceIds")(WorkspaceIds)
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
  }
}

