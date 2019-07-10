package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAnomalyDetectorsInput extends js.Object {
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions. If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're all returned.
    */
  var Dimensions: js.UndefOr[Dimensions] = js.undefined
  /**
    * The maximum number of results to return in one operation. The maximum value you can specify is 10. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var MaxResults: js.UndefOr[MaxReturnedResultsCount] = js.undefined
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified metric name. If there are multiple metrics with this name in different namespaces that have anomaly detection models, they're all returned.
    */
  var MetricName: js.UndefOr[MetricName] = js.undefined
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified namespace.
    */
  var Namespace: js.UndefOr[Namespace] = js.undefined
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeAnomalyDetectorsInput {
  @scala.inline
  def apply(
    Dimensions: Dimensions = null,
    MaxResults: js.UndefOr[MaxReturnedResultsCount] = js.undefined,
    MetricName: MetricName = null,
    Namespace: Namespace = null,
    NextToken: NextToken = null
  ): DescribeAnomalyDetectorsInput = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAnomalyDetectorsInput]
  }
}

