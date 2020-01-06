package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetImportJobsResponse extends js.Object {
  /**
    * An array of objects that summarize each dataset import job's properties.
    */
  var DatasetImportJobs: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.DatasetImportJobs] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.native
}

object ListDatasetImportJobsResponse {
  @scala.inline
  def apply(DatasetImportJobs: DatasetImportJobs = null, NextToken: NextToken = null): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (DatasetImportJobs != null) __obj.updateDynamic("DatasetImportJobs")(DatasetImportJobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
}

