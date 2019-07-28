package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMetricDataOutput extends js.Object {
  /**
    * Contains a message about this GetMetricData operation, if the operation results in such a message. An example of a message that may be returned is Maximum number of allowed metrics exceeded. If there is a message, as much of the operation as possible is still executed. A message appears here only if it is related to the global GetMetricData operation. Any message about a specific metric returned by the operation appears in the MetricDataResult object returned for that metric.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.undefined
  /**
    * The metrics that are returned, including the metric name, namespace, and dimensions.
    */
  var MetricDataResults: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricDataResults] = js.undefined
  /**
    * A token that marks the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.undefined
}

object GetMetricDataOutput {
  @scala.inline
  def apply(
    Messages: MetricDataResultMessages = null,
    MetricDataResults: MetricDataResults = null,
    NextToken: NextToken = null
  ): GetMetricDataOutput = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    if (MetricDataResults != null) __obj.updateDynamic("MetricDataResults")(MetricDataResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetMetricDataOutput]
  }
}

