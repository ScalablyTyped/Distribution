package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricStatisticsOutput extends js.Object {
  /**
    * The data points for the specified metric.
    */
  var Datapoints: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Datapoints] = js.native
  /**
    * A label for the specified metric.
    */
  var Label: js.UndefOr[MetricLabel] = js.native
}

object GetMetricStatisticsOutput {
  @scala.inline
  def apply(Datapoints: Datapoints = null, Label: MetricLabel = null): GetMetricStatisticsOutput = {
    val __obj = js.Dynamic.literal()
    if (Datapoints != null) __obj.updateDynamic("Datapoints")(Datapoints.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricStatisticsOutput]
  }
}

