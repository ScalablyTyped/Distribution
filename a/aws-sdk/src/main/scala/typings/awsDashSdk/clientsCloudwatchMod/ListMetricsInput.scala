package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetricsInput extends js.Object {
  /**
    * The dimensions to filter against.
    */
  var Dimensions: js.UndefOr[DimensionFilters] = js.undefined
  /**
    * The name of the metric to filter against.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricName] = js.undefined
  /**
    * The namespace to filter against.
    */
  var Namespace: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Namespace] = js.undefined
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.undefined
}

object ListMetricsInput {
  @scala.inline
  def apply(
    Dimensions: DimensionFilters = null,
    MetricName: MetricName = null,
    Namespace: Namespace = null,
    NextToken: NextToken = null
  ): ListMetricsInput = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMetricsInput]
  }
}

