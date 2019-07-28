package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImportSnapshotTasksResult extends js.Object {
  /**
    * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList] = js.undefined
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeImportSnapshotTasksResult {
  @scala.inline
  def apply(ImportSnapshotTasks: ImportSnapshotTaskList = null, NextToken: String = null): DescribeImportSnapshotTasksResult = {
    val __obj = js.Dynamic.literal()
    if (ImportSnapshotTasks != null) __obj.updateDynamic("ImportSnapshotTasks")(ImportSnapshotTasks)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeImportSnapshotTasksResult]
  }
}

