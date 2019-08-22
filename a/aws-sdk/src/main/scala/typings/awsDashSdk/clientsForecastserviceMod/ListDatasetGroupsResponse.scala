package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetGroupsResponse extends js.Object {
  /**
    * An array of objects that summarize each dataset group's properties.
    */
  var DatasetGroups: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.DatasetGroups] = js.undefined
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.undefined
}

object ListDatasetGroupsResponse {
  @scala.inline
  def apply(DatasetGroups: DatasetGroups = null, NextToken: NextToken = null): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (DatasetGroups != null) __obj.updateDynamic("DatasetGroups")(DatasetGroups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
}

