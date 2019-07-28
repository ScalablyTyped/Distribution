package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilter extends js.Object {
  /**
    * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the metric filter.
    */
  var filterName: js.UndefOr[FilterName] = js.undefined
  var filterPattern: js.UndefOr[FilterPattern] = js.undefined
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The metric transformations.
    */
  var metricTransformations: js.UndefOr[MetricTransformations] = js.undefined
}

object MetricFilter {
  @scala.inline
  def apply(
    creationTime: js.UndefOr[Timestamp] = js.undefined,
    filterName: FilterName = null,
    filterPattern: FilterPattern = null,
    logGroupName: LogGroupName = null,
    metricTransformations: MetricTransformations = null
  ): MetricFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creationTime)) __obj.updateDynamic("creationTime")(creationTime)
    if (filterName != null) __obj.updateDynamic("filterName")(filterName)
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (metricTransformations != null) __obj.updateDynamic("metricTransformations")(metricTransformations)
    __obj.asInstanceOf[MetricFilter]
  }
}

