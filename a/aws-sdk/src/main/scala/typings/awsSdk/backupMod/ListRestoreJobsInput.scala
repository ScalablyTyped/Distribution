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
  def apply(
    ByAccountId: AccountId = null,
    ByCreatedAfter: timestamp = null,
    ByCreatedBefore: timestamp = null,
    ByStatus: RestoreJobStatus = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null
  ): ListRestoreJobsInput = {
    val __obj = js.Dynamic.literal()
    if (ByAccountId != null) __obj.updateDynamic("ByAccountId")(ByAccountId.asInstanceOf[js.Any])
    if (ByCreatedAfter != null) __obj.updateDynamic("ByCreatedAfter")(ByCreatedAfter.asInstanceOf[js.Any])
    if (ByCreatedBefore != null) __obj.updateDynamic("ByCreatedBefore")(ByCreatedBefore.asInstanceOf[js.Any])
    if (ByStatus != null) __obj.updateDynamic("ByStatus")(ByStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRestoreJobsInput]
  }
}

