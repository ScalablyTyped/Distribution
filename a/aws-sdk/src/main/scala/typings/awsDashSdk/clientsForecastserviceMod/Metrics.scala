package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  /**
    * The root mean square error (RMSE).
    */
  var RMSE: js.UndefOr[Double] = js.undefined
  /**
    * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal probability. The distribution in this case is the loss function.
    */
  var WeightedQuantileLosses: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.WeightedQuantileLosses] = js.undefined
}

object Metrics {
  @scala.inline
  def apply(RMSE: Int | scala.Double = null, WeightedQuantileLosses: WeightedQuantileLosses = null): Metrics = {
    val __obj = js.Dynamic.literal()
    if (RMSE != null) __obj.updateDynamic("RMSE")(RMSE.asInstanceOf[js.Any])
    if (WeightedQuantileLosses != null) __obj.updateDynamic("WeightedQuantileLosses")(WeightedQuantileLosses)
    __obj.asInstanceOf[Metrics]
  }
}

