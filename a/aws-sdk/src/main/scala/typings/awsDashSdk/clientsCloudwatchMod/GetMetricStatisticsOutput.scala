package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMetricStatisticsOutput extends js.Object {
  /**
    * The data points for the specified metric.
    */
  var Datapoints: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Datapoints] = js.undefined
  /**
    * A label for the specified metric.
    */
  var Label: js.UndefOr[MetricLabel] = js.undefined
}

object GetMetricStatisticsOutput {
  @scala.inline
  def apply(Datapoints: Datapoints = null, Label: MetricLabel = null): GetMetricStatisticsOutput = {
    val __obj = js.Dynamic.literal()
    if (Datapoints != null) __obj.updateDynamic("Datapoints")(Datapoints)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    __obj.asInstanceOf[GetMetricStatisticsOutput]
  }
}

