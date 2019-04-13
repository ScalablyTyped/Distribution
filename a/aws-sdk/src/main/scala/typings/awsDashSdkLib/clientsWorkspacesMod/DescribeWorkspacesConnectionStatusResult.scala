package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspacesConnectionStatusResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the connection status of the WorkSpace.
    */
  var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.undefined
}

object DescribeWorkspacesConnectionStatusResult {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    WorkspacesConnectionStatus: WorkspaceConnectionStatusList = null
  ): DescribeWorkspacesConnectionStatusResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WorkspacesConnectionStatus != null) __obj.updateDynamic("WorkspacesConnectionStatus")(WorkspacesConnectionStatus)
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusResult]
  }
}

