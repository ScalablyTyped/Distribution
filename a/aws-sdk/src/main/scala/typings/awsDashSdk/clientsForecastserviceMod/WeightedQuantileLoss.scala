package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedQuantileLoss extends js.Object {
  /**
    * The difference between the predicted value and actual value over the quantile, weighted (normalized) by dividing by the sum over all quantiles.
    */
  var LossValue: js.UndefOr[Double] = js.undefined
  /**
    * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
    */
  var Quantile: js.UndefOr[Double] = js.undefined
}

object WeightedQuantileLoss {
  @scala.inline
  def apply(LossValue: js.UndefOr[Double] = js.undefined, Quantile: js.UndefOr[Double] = js.undefined): WeightedQuantileLoss = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(LossValue)) __obj.updateDynamic("LossValue")(LossValue)
    if (!js.isUndefined(Quantile)) __obj.updateDynamic("Quantile")(Quantile)
    __obj.asInstanceOf[WeightedQuantileLoss]
  }
}

