package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchMetricAction extends js.Object {
  /**
    * The CloudWatch metric name.
    */
  var metricName: String = js.native
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: String = js.native
  /**
    * An optional Unix timestamp.
    */
  var metricTimestamp: js.UndefOr[String] = js.native
  /**
    * The metric unit supported by CloudWatch.
    */
  var metricUnit: String = js.native
  /**
    * The CloudWatch metric value.
    */
  var metricValue: String = js.native
  /**
    * The IAM role that allows access to the CloudWatch metric.
    */
  var roleArn: AwsArn = js.native
}

object CloudwatchMetricAction {
  @scala.inline
  def apply(
    metricName: String,
    metricNamespace: String,
    metricUnit: String,
    metricValue: String,
    roleArn: AwsArn,
    metricTimestamp: String = null
  ): CloudwatchMetricAction = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchMetricAction]
  }
}

