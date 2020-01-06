package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetImportJobsResponse extends js.Object {
  /**
    * The list of dataset import jobs.
    */
  var datasetImportJobs: js.UndefOr[DatasetImportJobs] = js.native
  /**
    * A token for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetImportJobsResponse {
  @scala.inline
  def apply(datasetImportJobs: DatasetImportJobs = null, nextToken: NextToken = null): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetImportJobs != null) __obj.updateDynamic("datasetImportJobs")(datasetImportJobs.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
}

