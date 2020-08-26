package typings.awsSdk.backupMod

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
  def apply(): ListRestoreJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRestoreJobsOutput]
  }
  @scala.inline
  implicit class ListRestoreJobsOutputOps[Self <: ListRestoreJobsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRestoreJobsVarargs(value: RestoreJobsListMember*): Self = this.set("RestoreJobs", js.Array(value :_*))
    @scala.inline
    def setRestoreJobs(value: RestoreJobsList): Self = this.set("RestoreJobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreJobs: Self = this.set("RestoreJobs", js.undefined)
  }
  
}

