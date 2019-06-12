package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetImportJobsResponse extends js.Object {
  /**
    * The list of dataset import jobs.
    */
  var datasetImportJobs: js.UndefOr[DatasetImportJobs] = js.undefined
  /**
    * A token for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDatasetImportJobsResponse {
  @scala.inline
  def apply(datasetImportJobs: DatasetImportJobs = null, nextToken: NextToken = null): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetImportJobs != null) __obj.updateDynamic("datasetImportJobs")(datasetImportJobs)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
}

