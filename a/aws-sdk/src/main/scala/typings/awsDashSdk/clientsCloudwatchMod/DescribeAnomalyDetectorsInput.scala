package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAnomalyDetectorsInput extends js.Object {
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions. If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're all returned.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  /**
    * The maximum number of results to return in one operation. The maximum value you can specify is 10. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var MaxResults: js.UndefOr[MaxReturnedResultsCount] = js.undefined
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified metric name. If there are multiple metrics with this name in different namespaces that have anomaly detection models, they're all returned.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricName] = js.undefined
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified namespace.
    */
  var Namespace: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Namespace] = js.undefined
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.undefined
}

object DescribeAnomalyDetectorsInput {
  @scala.inline
  def apply(
    Dimensions: Dimensions = null,
    MaxResults: Int | Double = null,
    MetricName: MetricName = null,
    Namespace: Namespace = null,
    NextToken: NextToken = null
  ): DescribeAnomalyDetectorsInput = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAnomalyDetectorsInput]
  }
}

