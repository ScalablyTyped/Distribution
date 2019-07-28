package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsageForecastRequest extends js.Object {
  /**
    * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer filters.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  /**
    * How granular you want the forecast to be. You can get 3 months of DAILY forecasts or 12 months of MONTHLY forecasts. The GetUsageForecast operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: typings.awsDashSdk.clientsCostexplorerMod.Granularity
  /**
    * Which metric Cost Explorer uses to create your forecast. Valid values for a GetUsageForecast call are the following:   USAGE_QUANTITY   NORMALIZED_USAGE_AMOUNT  
    */
  var Metric: typings.awsDashSdk.clientsCostexplorerMod.Metric
  /**
    * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction intervals.
    */
  var PredictionIntervalLevel: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.PredictionIntervalLevel] = js.undefined
  /**
    * The start and end dates of the period that you want to retrieve usage forecast for. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval
}

object GetUsageForecastRequest {
  @scala.inline
  def apply(
    Granularity: Granularity,
    Metric: Metric,
    TimePeriod: DateInterval,
    Filter: Expression = null,
    PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel] = js.undefined
  ): GetUsageForecastRequest = {
    val __obj = js.Dynamic.literal(Granularity = Granularity.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], TimePeriod = TimePeriod)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(PredictionIntervalLevel)) __obj.updateDynamic("PredictionIntervalLevel")(PredictionIntervalLevel)
    __obj.asInstanceOf[GetUsageForecastRequest]
  }
}

