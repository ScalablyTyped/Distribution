package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datapoint extends js.Object {
  /**
    * The average of the metric values that correspond to the data point.
    */
  var Average: js.UndefOr[DatapointValue] = js.native
  /**
    * The percentile statistic for the data point.
    */
  var ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.native
  /**
    * The maximum metric value for the data point.
    */
  var Maximum: js.UndefOr[DatapointValue] = js.native
  /**
    * The minimum metric value for the data point.
    */
  var Minimum: js.UndefOr[DatapointValue] = js.native
  /**
    * The number of metric values that contributed to the aggregate value of this data point.
    */
  var SampleCount: js.UndefOr[DatapointValue] = js.native
  /**
    * The sum of the metric values for the data point.
    */
  var Sum: js.UndefOr[DatapointValue] = js.native
  /**
    * The time stamp used for the data point.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Timestamp] = js.native
  /**
    * The standard unit for the data point.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object Datapoint {
  @scala.inline
  def apply(
    Average: Int | Double = null,
    ExtendedStatistics: DatapointValueMap = null,
    Maximum: Int | Double = null,
    Minimum: Int | Double = null,
    SampleCount: Int | Double = null,
    Sum: Int | Double = null,
    Timestamp: Timestamp = null,
    Unit: StandardUnit = null
  ): Datapoint = {
    val __obj = js.Dynamic.literal()
    if (Average != null) __obj.updateDynamic("Average")(Average.asInstanceOf[js.Any])
    if (ExtendedStatistics != null) __obj.updateDynamic("ExtendedStatistics")(ExtendedStatistics.asInstanceOf[js.Any])
    if (Maximum != null) __obj.updateDynamic("Maximum")(Maximum.asInstanceOf[js.Any])
    if (Minimum != null) __obj.updateDynamic("Minimum")(Minimum.asInstanceOf[js.Any])
    if (SampleCount != null) __obj.updateDynamic("SampleCount")(SampleCount.asInstanceOf[js.Any])
    if (Sum != null) __obj.updateDynamic("Sum")(Sum.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datapoint]
  }
}

