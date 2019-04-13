package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticalThreshold extends js.Object {
  /**
    * The percentile which resolves to a threshold value by which compliance with a behavior is determined. Metrics are collected over the specified period (durationSeconds) from all reporting devices in your account and statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the accumulated measurements from the device fall above or below (comparisonOperator) the value associated with the percentile specified, then the device is considered to be in compliance with the behavior, otherwise a violation occurs.
    */
  var statistic: js.UndefOr[EvaluationStatistic] = js.undefined
}

object StatisticalThreshold {
  @scala.inline
  def apply(statistic: EvaluationStatistic = null): StatisticalThreshold = {
    val __obj = js.Dynamic.literal()
    if (statistic != null) __obj.updateDynamic("statistic")(statistic)
    __obj.asInstanceOf[StatisticalThreshold]
  }
}

