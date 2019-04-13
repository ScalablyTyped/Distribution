package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspaceDirectoriesResult extends js.Object {
  /**
    * Information about the directories.
    */
  var Directories: js.UndefOr[DirectoryList] = js.undefined
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeWorkspaceDirectoriesResult {
  @scala.inline
  def apply(Directories: DirectoryList = null, NextToken: PaginationToken = null): DescribeWorkspaceDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    if (Directories != null) __obj.updateDynamic("Directories")(Directories)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesResult]
  }
}

