package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricDataOutput extends js.Object {
  /**
    * Contains a message about this GetMetricData operation, if the operation results in such a message. An example of a message that may be returned is Maximum number of allowed metrics exceeded. If there is a message, as much of the operation as possible is still executed. A message appears here only if it is related to the global GetMetricData operation. Any message about a specific metric returned by the operation appears in the MetricDataResult object returned for that metric.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.native
  /**
    * The metrics that are returned, including the metric name, namespace, and dimensions.
    */
  var MetricDataResults: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricDataResults] = js.native
  /**
    * A token that marks the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.native
}

object GetMetricDataOutput {
  @scala.inline
  def apply(
    Messages: MetricDataResultMessages = null,
    MetricDataResults: MetricDataResults = null,
    NextToken: NextToken = null
  ): GetMetricDataOutput = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    if (MetricDataResults != null) __obj.updateDynamic("MetricDataResults")(MetricDataResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricDataOutput]
  }
}

