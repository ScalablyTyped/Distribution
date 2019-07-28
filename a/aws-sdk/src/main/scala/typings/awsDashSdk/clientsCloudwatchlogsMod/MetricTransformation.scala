package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricTransformation extends js.Object {
  /**
    * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.undefined
  /**
    * The name of the CloudWatch metric.
    */
  var metricName: MetricName
  /**
    * The namespace of the CloudWatch metric.
    */
  var metricNamespace: MetricNamespace
  /**
    * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
    */
  var metricValue: MetricValue
}

object MetricTransformation {
  @scala.inline
  def apply(
    metricName: MetricName,
    metricNamespace: MetricNamespace,
    metricValue: MetricValue,
    defaultValue: js.UndefOr[DefaultValue] = js.undefined
  ): MetricTransformation = {
    val __obj = js.Dynamic.literal(metricName = metricName, metricNamespace = metricNamespace, metricValue = metricValue)
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.asInstanceOf[MetricTransformation]
  }
}

