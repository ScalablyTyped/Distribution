package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupJobsOutput extends js.Object {
  /**
    * An array of structures containing metadata about your backup jobs returned in JSON format.
    */
  var BackupJobs: js.UndefOr[BackupJobsList] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBackupJobsOutput {
  @scala.inline
  def apply(BackupJobs: BackupJobsList = null, NextToken: String = null): ListBackupJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupJobs != null) __obj.updateDynamic("BackupJobs")(BackupJobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupJobsOutput]
  }
}

