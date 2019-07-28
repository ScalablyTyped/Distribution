package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupJobsOutput extends js.Object {
  /**
    * An array of structures containing metadata about your backup jobs returned in JSON format.
    */
  var BackupJobs: js.UndefOr[BackupJobsList] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListBackupJobsOutput {
  @scala.inline
  def apply(BackupJobs: BackupJobsList = null, NextToken: String = null): ListBackupJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupJobs != null) __obj.updateDynamic("BackupJobs")(BackupJobs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupJobsOutput]
  }
}

