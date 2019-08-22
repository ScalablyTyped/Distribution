package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetsResponse extends js.Object {
  /**
    * An array of objects that summarize each dataset's properties.
    */
  var Datasets: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Datasets] = js.undefined
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.undefined
}

object ListDatasetsResponse {
  @scala.inline
  def apply(Datasets: Datasets = null, NextToken: NextToken = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Datasets != null) __obj.updateDynamic("Datasets")(Datasets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

