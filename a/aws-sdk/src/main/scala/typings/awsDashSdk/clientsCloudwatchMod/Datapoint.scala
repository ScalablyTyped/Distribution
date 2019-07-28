package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datapoint extends js.Object {
  /**
    * The average of the metric values that correspond to the data point.
    */
  var Average: js.UndefOr[DatapointValue] = js.undefined
  /**
    * The percentile statistic for the data point.
    */
  var ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.undefined
  /**
    * The maximum metric value for the data point.
    */
  var Maximum: js.UndefOr[DatapointValue] = js.undefined
  /**
    * The minimum metric value for the data point.
    */
  var Minimum: js.UndefOr[DatapointValue] = js.undefined
  /**
    * The number of metric values that contributed to the aggregate value of this data point.
    */
  var SampleCount: js.UndefOr[DatapointValue] = js.undefined
  /**
    * The sum of the metric values for the data point.
    */
  var Sum: js.UndefOr[DatapointValue] = js.undefined
  /**
    * The time stamp used for the data point.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Timestamp] = js.undefined
  /**
    * The standard unit for the data point.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
}

object Datapoint {
  @scala.inline
  def apply(
    Average: js.UndefOr[DatapointValue] = js.undefined,
    ExtendedStatistics: DatapointValueMap = null,
    Maximum: js.UndefOr[DatapointValue] = js.undefined,
    Minimum: js.UndefOr[DatapointValue] = js.undefined,
    SampleCount: js.UndefOr[DatapointValue] = js.undefined,
    Sum: js.UndefOr[DatapointValue] = js.undefined,
    Timestamp: Timestamp = null,
    Unit: StandardUnit = null
  ): Datapoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Average)) __obj.updateDynamic("Average")(Average)
    if (ExtendedStatistics != null) __obj.updateDynamic("ExtendedStatistics")(ExtendedStatistics)
    if (!js.isUndefined(Maximum)) __obj.updateDynamic("Maximum")(Maximum)
    if (!js.isUndefined(Minimum)) __obj.updateDynamic("Minimum")(Minimum)
    if (!js.isUndefined(SampleCount)) __obj.updateDynamic("SampleCount")(SampleCount)
    if (!js.isUndefined(Sum)) __obj.updateDynamic("Sum")(Sum)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datapoint]
  }
}

