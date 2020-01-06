package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataRepositoryTasksResponse extends js.Object {
  /**
    * The collection of data repository task descriptions returned.
    */
  var DataRepositoryTasks: js.UndefOr[typings.awsDashSdk.clientsFsxMod.DataRepositoryTasks] = js.native
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.NextToken] = js.native
}

object DescribeDataRepositoryTasksResponse {
  @scala.inline
  def apply(DataRepositoryTasks: DataRepositoryTasks = null, NextToken: NextToken = null): DescribeDataRepositoryTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (DataRepositoryTasks != null) __obj.updateDynamic("DataRepositoryTasks")(DataRepositoryTasks.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataRepositoryTasksResponse]
  }
}

