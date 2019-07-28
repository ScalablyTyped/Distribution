package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspaceDirectoriesRequest extends js.Object {
  /**
    * The identifiers of the directories. If the value is null, all directories are retrieved.
    */
  var DirectoryIds: js.UndefOr[DirectoryIdList] = js.undefined
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeWorkspaceDirectoriesRequest {
  @scala.inline
  def apply(DirectoryIds: DirectoryIdList = null, NextToken: PaginationToken = null): DescribeWorkspaceDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryIds != null) __obj.updateDynamic("DirectoryIds")(DirectoryIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesRequest]
  }
}

