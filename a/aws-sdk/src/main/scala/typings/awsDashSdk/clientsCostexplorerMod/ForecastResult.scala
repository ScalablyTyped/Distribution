package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForecastResult extends js.Object {
  /**
    * The mean value of the forecast.
    */
  var MeanValue: js.UndefOr[GenericString] = js.native
  /**
    * The lower limit for the prediction interval. 
    */
  var PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.native
  /**
    * The upper limit for the prediction interval. 
    */
  var PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.native
  /**
    * The period of time that the forecast covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
}

object ForecastResult {
  @scala.inline
  def apply(
    MeanValue: GenericString = null,
    PredictionIntervalLowerBound: GenericString = null,
    PredictionIntervalUpperBound: GenericString = null,
    TimePeriod: DateInterval = null
  ): ForecastResult = {
    val __obj = js.Dynamic.literal()
    if (MeanValue != null) __obj.updateDynamic("MeanValue")(MeanValue.asInstanceOf[js.Any])
    if (PredictionIntervalLowerBound != null) __obj.updateDynamic("PredictionIntervalLowerBound")(PredictionIntervalLowerBound.asInstanceOf[js.Any])
    if (PredictionIntervalUpperBound != null) __obj.updateDynamic("PredictionIntervalUpperBound")(PredictionIntervalUpperBound.asInstanceOf[js.Any])
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForecastResult]
  }
}

