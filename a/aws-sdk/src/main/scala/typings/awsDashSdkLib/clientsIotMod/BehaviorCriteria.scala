package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BehaviorCriteria extends js.Object {
  /**
    * The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
  /**
    * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
    */
  var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.undefined
  /**
    * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
    */
  var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.undefined
  /**
    * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time dimension (for example, NUM_MESSAGES_SENT). For a statisticalThreshhold metric comparison, measurements from all devices are accumulated over this time duration before being used to calculate percentiles, and later, measurements from an individual device are also accumulated over this time duration before being given a percentile rank.
    */
  var durationSeconds: js.UndefOr[DurationSeconds] = js.undefined
  /**
    * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
    */
  var statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.undefined
  /**
    * The value to be compared with the metric.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}

object BehaviorCriteria {
  @scala.inline
  def apply(
    comparisonOperator: ComparisonOperator = null,
    consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.undefined,
    consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.undefined,
    durationSeconds: js.UndefOr[DurationSeconds] = js.undefined,
    statisticalThreshold: StatisticalThreshold = null,
    value: MetricValue = null
  ): BehaviorCriteria = {
    val __obj = js.Dynamic.literal()
    if (comparisonOperator != null) __obj.updateDynamic("comparisonOperator")(comparisonOperator.asInstanceOf[js.Any])
    if (!js.isUndefined(consecutiveDatapointsToAlarm)) __obj.updateDynamic("consecutiveDatapointsToAlarm")(consecutiveDatapointsToAlarm)
    if (!js.isUndefined(consecutiveDatapointsToClear)) __obj.updateDynamic("consecutiveDatapointsToClear")(consecutiveDatapointsToClear)
    if (!js.isUndefined(durationSeconds)) __obj.updateDynamic("durationSeconds")(durationSeconds)
    if (statisticalThreshold != null) __obj.updateDynamic("statisticalThreshold")(statisticalThreshold)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BehaviorCriteria]
  }
}

