package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricTransformation extends js.Object {
  /**
    * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.native
  /**
    * The name of the CloudWatch metric.
    */
  var metricName: MetricName = js.native
  /**
    * The namespace of the CloudWatch metric.
    */
  var metricNamespace: MetricNamespace = js.native
  /**
    * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
    */
  var metricValue: MetricValue = js.native
}

object MetricTransformation {
  @scala.inline
  def apply(
    metricName: MetricName,
    metricNamespace: MetricNamespace,
    metricValue: MetricValue,
    defaultValue: Int | Double = null
  ): MetricTransformation = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTransformation]
  }
}

