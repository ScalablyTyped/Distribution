package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudwatchMetricAction extends js.Object {
  /**
    * The CloudWatch metric name.
    */
  var metricName: String
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: String
  /**
    * An optional Unix timestamp.
    */
  var metricTimestamp: js.UndefOr[String] = js.undefined
  /**
    * The metric unit supported by CloudWatch.
    */
  var metricUnit: String
  /**
    * The CloudWatch metric value.
    */
  var metricValue: String
  /**
    * The IAM role that allows access to the CloudWatch metric.
    */
  var roleArn: AwsArn
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
    val __obj = js.Dynamic.literal(metricName = metricName, metricNamespace = metricNamespace, metricUnit = metricUnit, metricValue = metricValue, roleArn = roleArn)
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp)
    __obj.asInstanceOf[CloudwatchMetricAction]
  }
}

