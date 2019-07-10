package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDatum extends js.Object {
  /**
    * Array of numbers that is used along with the Values array. Each number in the Count array is the number of times the corresponding value in the Values array occurred during the period.  If you omit the Counts array, the default of 1 is used as the value for each count. If you include a Counts array, it must include the same amount of values as the Values array.
    */
  var Counts: js.UndefOr[Counts] = js.undefined
  /**
    * The dimensions associated with the metric.
    */
  var Dimensions: js.UndefOr[Dimensions] = js.undefined
  /**
    * The name of the metric.
    */
  var MetricName: awsDashSdkLib.clientsCloudwatchMod.MetricName
  /**
    * The statistical values for the metric.
    */
  var StatisticValues: js.UndefOr[StatisticSet] = js.undefined
  /**
    * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution is available only for custom metrics. For more information about high-resolution metrics, see High-Resolution Metrics in the Amazon CloudWatch User Guide.  This field is optional, if you do not specify it the default of 60 is used.
    */
  var StorageResolution: js.UndefOr[StorageResolution] = js.undefined
  /**
    * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var Timestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * When you are using a Put operation, this defines what unit you want to use when storing the metric. In a Get operation, this displays the unit that is used for the metric.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
  /**
    * The value for the metric. Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
    */
  var Value: js.UndefOr[DatapointValue] = js.undefined
  /**
    * Array of numbers representing the values for the metric during the period. Each unique value is listed just once in this array, and the corresponding number in the Counts array specifies the number of times that value occurred during the period. You can include up to 150 unique values in each PutMetricData action that specifies a Values array. Although the Values array accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
    */
  var Values: js.UndefOr[Values] = js.undefined
}

object MetricDatum {
  @scala.inline
  def apply(
    MetricName: MetricName,
    Counts: Counts = null,
    Dimensions: Dimensions = null,
    StatisticValues: StatisticSet = null,
    StorageResolution: js.UndefOr[StorageResolution] = js.undefined,
    Timestamp: Timestamp = null,
    Unit: StandardUnit = null,
    Value: js.UndefOr[DatapointValue] = js.undefined,
    Values: Values = null
  ): MetricDatum = {
    val __obj = js.Dynamic.literal(MetricName = MetricName)
    if (Counts != null) __obj.updateDynamic("Counts")(Counts)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (StatisticValues != null) __obj.updateDynamic("StatisticValues")(StatisticValues)
    if (!js.isUndefined(StorageResolution)) __obj.updateDynamic("StorageResolution")(StorageResolution)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[MetricDatum]
  }
}

