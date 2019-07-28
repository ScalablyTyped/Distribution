package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetImportJobsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to list the dataset import jobs for.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  /**
    * The maximum number of dataset import jobs to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token returned from the previous call to ListDatasetImportJobs for getting the next set of dataset import jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDatasetImportJobsRequest {
  @scala.inline
  def apply(
    datasetArn: Arn = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListDatasetImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDatasetImportJobsRequest]
  }
}

