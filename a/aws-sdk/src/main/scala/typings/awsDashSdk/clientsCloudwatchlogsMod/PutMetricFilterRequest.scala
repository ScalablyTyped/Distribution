package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutMetricFilterRequest extends js.Object {
  /**
    * A name for the metric filter.
    */
  var filterName: FilterName
  /**
    * A filter pattern for extracting metric data out of ingested log events.
    */
  var filterPattern: FilterPattern
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * A collection of information that defines how metric data gets emitted.
    */
  var metricTransformations: MetricTransformations
}

object PutMetricFilterRequest {
  @scala.inline
  def apply(
    filterName: FilterName,
    filterPattern: FilterPattern,
    logGroupName: LogGroupName,
    metricTransformations: MetricTransformations
  ): PutMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName, filterPattern = filterPattern, logGroupName = logGroupName, metricTransformations = metricTransformations)
  
    __obj.asInstanceOf[PutMetricFilterRequest]
  }
}

