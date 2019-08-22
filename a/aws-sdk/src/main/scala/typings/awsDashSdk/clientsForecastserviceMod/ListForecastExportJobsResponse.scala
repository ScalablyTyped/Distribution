package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListForecastExportJobsResponse extends js.Object {
  /**
    * An array of objects that summarize each export job's properties.
    */
  var ForecastExportJobs: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.ForecastExportJobs] = js.undefined
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.undefined
}

object ListForecastExportJobsResponse {
  @scala.inline
  def apply(ForecastExportJobs: ForecastExportJobs = null, NextToken: NextToken = null): ListForecastExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (ForecastExportJobs != null) __obj.updateDynamic("ForecastExportJobs")(ForecastExportJobs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListForecastExportJobsResponse]
  }
}

