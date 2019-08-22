package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluationParameters extends js.Object {
  /**
    * The point from the end of the dataset where you want to split the data for model training and evaluation. The value is specified as the number of data points.
    */
  var BackTestWindowOffset: js.UndefOr[Integer] = js.undefined
  /**
    * The number of times to split the input data. The default is 1. The range is 1 through 5.
    */
  var NumberOfBacktestWindows: js.UndefOr[Integer] = js.undefined
}

object EvaluationParameters {
  @scala.inline
  def apply(
    BackTestWindowOffset: js.UndefOr[Integer] = js.undefined,
    NumberOfBacktestWindows: js.UndefOr[Integer] = js.undefined
  ): EvaluationParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BackTestWindowOffset)) __obj.updateDynamic("BackTestWindowOffset")(BackTestWindowOffset)
    if (!js.isUndefined(NumberOfBacktestWindows)) __obj.updateDynamic("NumberOfBacktestWindows")(NumberOfBacktestWindows)
    __obj.asInstanceOf[EvaluationParameters]
  }
}

