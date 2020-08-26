package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRestoreJobsInput extends js.Object {
  /**
    * The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
    */
  var ByAccountId: js.UndefOr[AccountId] = js.native
  /**
    * Returns only restore jobs that were created after the specified date.
    */
  var ByCreatedAfter: js.UndefOr[timestamp] = js.native
  /**
    * Returns only restore jobs that were created before the specified date.
    */
  var ByCreatedBefore: js.UndefOr[timestamp] = js.native
  /**
    * Returns only restore jobs associated with the specified job status.
    */
  var ByStatus: js.UndefOr[RestoreJobStatus] = js.native
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupMod.MaxResults] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListRestoreJobsInput {
  @scala.inline
  def apply(): ListRestoreJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRestoreJobsInput]
  }
  @scala.inline
  implicit class ListRestoreJobsInputOps[Self <: ListRestoreJobsInput] (val x: Self) extends AnyVal {
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
    def setByAccountId(value: AccountId): Self = this.set("ByAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByAccountId: Self = this.set("ByAccountId", js.undefined)
    @scala.inline
    def setByCreatedAfter(value: timestamp): Self = this.set("ByCreatedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByCreatedAfter: Self = this.set("ByCreatedAfter", js.undefined)
    @scala.inline
    def setByCreatedBefore(value: timestamp): Self = this.set("ByCreatedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByCreatedBefore: Self = this.set("ByCreatedBefore", js.undefined)
    @scala.inline
    def setByStatus(value: RestoreJobStatus): Self = this.set("ByStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByStatus: Self = this.set("ByStatus", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

