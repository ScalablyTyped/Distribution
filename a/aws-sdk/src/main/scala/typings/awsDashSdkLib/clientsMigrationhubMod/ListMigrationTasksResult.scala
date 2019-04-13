package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMigrationTasksResult extends js.Object {
  /**
    * Lists the migration task's summary which includes: MigrationTaskName, ProgressPercent, ProgressUpdateStream, Status, and the UpdateDateTime for each task.
    */
  var MigrationTaskSummaryList: js.UndefOr[MigrationTaskSummaryList] = js.undefined
  /**
    * If there are more migration tasks than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ListMigrationTasksResult {
  @scala.inline
  def apply(MigrationTaskSummaryList: MigrationTaskSummaryList = null, NextToken: Token = null): ListMigrationTasksResult = {
    val __obj = js.Dynamic.literal()
    if (MigrationTaskSummaryList != null) __obj.updateDynamic("MigrationTaskSummaryList")(MigrationTaskSummaryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMigrationTasksResult]
  }
}

