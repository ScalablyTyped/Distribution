package typings.applicationinsights.outDeclarationsContractsGeneratedMetricDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of the Metric item is a list of measurements (single data points) and/or aggregations.
  */
@js.native
trait MetricData
  extends typings.applicationinsights.outDeclarationsContractsGeneratedDomainMod.^ {
  /**
    * List of metrics. Only one metric in the list is currently supported by Application Insights storage. If multiple data points were sent only the first one will be used.
    */
  var metrics: js.Array[typings.applicationinsights.outDeclarationsContractsGeneratedDataPointMod.^] = js.native
  /**
    * Collection of custom properties.
    */
  var properties: js.Any = js.native
  /**
    * Schema version
    */
  var ver: Double = js.native
}

