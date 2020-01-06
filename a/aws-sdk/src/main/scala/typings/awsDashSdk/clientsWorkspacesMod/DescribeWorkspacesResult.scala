package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspacesResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the WorkSpaces. Because CreateWorkspaces is an asynchronous operation, some of the returned information could be incomplete.
    */
  var Workspaces: js.UndefOr[WorkspaceList] = js.native
}

object DescribeWorkspacesResult {
  @scala.inline
  def apply(NextToken: PaginationToken = null, Workspaces: WorkspaceList = null): DescribeWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Workspaces != null) __obj.updateDynamic("Workspaces")(Workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspacesResult]
  }
}

