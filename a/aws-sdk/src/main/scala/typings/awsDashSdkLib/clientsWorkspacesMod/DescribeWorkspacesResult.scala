package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspacesResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the WorkSpaces. Because CreateWorkspaces is an asynchronous operation, some of the returned information could be incomplete.
    */
  var Workspaces: js.UndefOr[WorkspaceList] = js.undefined
}

object DescribeWorkspacesResult {
  @scala.inline
  def apply(NextToken: PaginationToken = null, Workspaces: WorkspaceList = null): DescribeWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Workspaces != null) __obj.updateDynamic("Workspaces")(Workspaces)
    __obj.asInstanceOf[DescribeWorkspacesResult]
  }
}

