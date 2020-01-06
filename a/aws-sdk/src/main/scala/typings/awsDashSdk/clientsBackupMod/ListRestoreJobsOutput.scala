package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRestoreJobsOutput extends js.Object {
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * An array of objects that contain detailed information about jobs to restore saved resources.
    */
  var RestoreJobs: js.UndefOr[RestoreJobsList] = js.native
}

object ListRestoreJobsOutput {
  @scala.inline
  def apply(NextToken: String = null, RestoreJobs: RestoreJobsList = null): ListRestoreJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RestoreJobs != null) __obj.updateDynamic("RestoreJobs")(RestoreJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRestoreJobsOutput]
  }
}

