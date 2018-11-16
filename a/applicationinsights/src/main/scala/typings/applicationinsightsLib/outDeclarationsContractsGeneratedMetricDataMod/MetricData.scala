package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedMetricDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * An instance of the Metric item is a list of measurements (single data points) and/or aggregations.
 */
@js.native
trait MetricData
  extends applicationinsightsLib.outDeclarationsContractsGeneratedDomainMod.namespaced {
  /**
       * List of metrics. Only one metric in the list is currently supported by Application Insights storage. If multiple data points were sent only the first one will be used.
       */
  var metrics: js.Array[applicationinsightsLib.outDeclarationsContractsGeneratedDataPointMod.namespaced] = js.native
  /**
       * Collection of custom properties.
       */
  var properties: js.Any = js.native
  /**
       * Schema version
       */
  var ver: scala.Double = js.native
}

