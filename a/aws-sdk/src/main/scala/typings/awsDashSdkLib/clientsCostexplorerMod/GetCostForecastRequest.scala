package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCostForecastRequest extends js.Object {
  /**
    * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer filters.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  /**
    * How granular you want the forecast to be. You can get 3 months of DAILY forecasts or 12 months of MONTHLY forecasts. The GetCostForecast operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: awsDashSdkLib.clientsCostexplorerMod.Granularity
  /**
    * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates, see Why does the "blended" annotation appear on some line items in my bill?.  Valid values for a GetCostForecast call are the following:   AmortizedCost   BlendedCost   NetAmortizedCost   NetUnblendedCost   UnblendedCost  
    */
  var Metric: awsDashSdkLib.clientsCostexplorerMod.Metric
  /**
    * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction intervals.
    */
  var PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel] = js.undefined
  /**
    * The period of time that you want the forecast to cover.
    */
  var TimePeriod: DateInterval
}

object GetCostForecastRequest {
  @scala.inline
  def apply(
    Granularity: Granularity,
    Metric: Metric,
    TimePeriod: DateInterval,
    Filter: Expression = null,
    PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel] = js.undefined
  ): GetCostForecastRequest = {
    val __obj = js.Dynamic.literal(Granularity = Granularity.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], TimePeriod = TimePeriod)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(PredictionIntervalLevel)) __obj.updateDynamic("PredictionIntervalLevel")(PredictionIntervalLevel)
    __obj.asInstanceOf[GetCostForecastRequest]
  }
}

