package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourceSyncJobsResponse extends js.Object {
  /**
    * A history of synchronization jobs for the data source.
    */
  var History: js.UndefOr[DataSourceSyncJobHistoryList] = js.native
  /**
    * The GetDataSourceSyncJobHistory operation returns a page of vocabularies at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Kendra returns the NextPage token. Include the token in the next request to the GetDataSourceSyncJobHistory operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsKendraMod.NextToken] = js.native
}

object ListDataSourceSyncJobsResponse {
  @scala.inline
  def apply(History: DataSourceSyncJobHistoryList = null, NextToken: NextToken = null): ListDataSourceSyncJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (History != null) __obj.updateDynamic("History")(History.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourceSyncJobsResponse]
  }
}

