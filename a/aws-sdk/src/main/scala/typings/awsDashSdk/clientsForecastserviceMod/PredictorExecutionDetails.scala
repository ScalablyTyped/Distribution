package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictorExecutionDetails extends js.Object {
  /**
    * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var PredictorExecutions: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.PredictorExecutions] = js.native
}

object PredictorExecutionDetails {
  @scala.inline
  def apply(PredictorExecutions: PredictorExecutions = null): PredictorExecutionDetails = {
    val __obj = js.Dynamic.literal()
    if (PredictorExecutions != null) __obj.updateDynamic("PredictorExecutions")(PredictorExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictorExecutionDetails]
  }
}

