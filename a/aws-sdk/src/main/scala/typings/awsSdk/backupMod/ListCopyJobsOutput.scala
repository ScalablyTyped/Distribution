package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCopyJobsOutput extends js.Object {
  /**
    * An array of structures containing metadata about your copy jobs returned in JSON format. 
    */
  var CopyJobs: js.UndefOr[CopyJobsList] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token. 
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListCopyJobsOutput {
  @scala.inline
  def apply(CopyJobs: CopyJobsList = null, NextToken: String = null): ListCopyJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (CopyJobs != null) __obj.updateDynamic("CopyJobs")(CopyJobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCopyJobsOutput]
  }
}

